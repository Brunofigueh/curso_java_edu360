package b.com.cdb.bancodigitalfinal.service;

import java.util.UUID;

import b.com.cdb.bancodigitalfinal.dao.ClienteDAO;
import b.com.cdb.bancodigitalfinal.dao.EnderecoDAO;
import b.com.cdb.bancodigitalfinal.entity.Cliente;
import b.com.cdb.bancodigitalfinal.entity.Endereco;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class ClienteService {
	 
	
	ValidadorCPF validacaoCpf = new ValidadorCPF();

	ClienteDAO clienteDao = new ClienteDAO();
	EnderecoDAO enderecoDao = new EnderecoDAO();
	
	public Cliente addCliente(String nome, String cpf, String dataNascimento,  Endereco endereco )
	{
		/**
		 * Aqui apos a chamada de todos o métodos e validação de tais, efim é adicioando o 
		 * cliente .
		 */

		if ( clienteDao.cpfCheck(cpf))
		{
			System.out.println("Esse CPF: "+cpf+" possui cadastro e conta ativa e nossos sistemas.");
			return null;
		}
		
		if (  !validacaoCpf.validarCPF(cpf) )
		{
			System.out.println("CPF não valido");
			return null;
		}
		if (!validarNome(nome)   )
		{
			return null;
		}
		if ( !validarDataNasc(dataNascimento) )
		{
			return null;
		}
		if ( !validarEndereco(endereco) )
		{
			return null;
		}

	
		
		UUID uuid = UUID.randomUUID();
		
		Cliente cliente = new Cliente();
		
	
		cliente.setNome(nome);
		cliente.setCPF(cpf);
		cliente.setDataNasc(dataNascimento);
		cliente.setEndereco(endereco);
		cliente.setClienteID(uuid);
		
		clienteDao.addCliente(cliente);
		//System.out.println("ADICIONEI CLIENTE: "+cliente.getNome());
		

		
		return cliente;
	}

	
	//VALIDAÇÃO DO ENDEREÇO 
	
	//Formato esperado do CEP
	private static final String FORMATO_CEP =  "^\\d{5}-\\d{2}$";
	/**
	 * Validação do dados de endereçõ para então serem adicionados a obj endereco.
	 * 
	 * @param FORMATO_CEP: Constante que compara um REGEX que verifica se o cep esta no formato padrão. 
	 */
	
	private boolean validarEndereco(Endereco enderecos) {

		if( enderecos.getNumero() <= 0 )
		{
			System.out.println("Número invádo.");
			return false;
		}
		if( enderecos.getRua().length() < 2 || enderecos.getRua().length() > 240 || enderecos.getRua() == null )
		{
			System.out.println("Você precisa digitar um rua válida.");
			return false;
		}
		if(  enderecos.getCidade().length() < 2 || enderecos.getCidade().length() > 120 || enderecos.getCidade() == null )
		{
			System.out.println("Digite uma cidade válida.");
			return false;
		}
		if(  enderecos.getEstado().length() < 2 || enderecos.getEstado().length() > 40 || enderecos.getEstado() == null)
		{
			System.out.println("Digite um Estado válido.");
			return false;
		}
		if(!enderecos.getCep().matches(FORMATO_CEP)) 
		{
			System.out.println("Digite um CEP válido.");
			return false;
		}
		
		/*
		 * Após validação todos os dados de endereçõ são adcionados
		 * ao objeto endereco e então ao cliente. 
		 */
		Endereco endereco = new Endereco();
		endereco.setCep(endereco.getCep());
		endereco.setRua(endereco.getRua());
		endereco.setNumero(endereco.getNumero());
		endereco.setCidade(endereco.getCidade());
		endereco.setEstado(endereco.getEstado());
		
		enderecoDao.addEndereco(endereco);
		
		
		return true;
	}
	
	
	
	//VALIDANDO DATA DE NASCIMENTO
	
	// Formato em regex para comparar se o campo CPF foi digitado da maneira correta.
	private static final String FORMATO_DATA_NASCIMENTO = "^\\d{2}\\/\\d{2}\\/\\d{4}$";
	
	private boolean validarDataNasc(String dataNascimento) {
		/**
		 * Valida a data de nascimento.
		 * @param formatoDataEntrada:  Define o formato de entrada da data para posterior coversão de tipos.
		 * @param dataNascimentoFormatada: para data formatada para tipo LocalDate.
		 * @param calculoData: data convertida para LocalDate
		 * @param idadeAtual: Recebe calculo da idade.
		 */
		
		
		
		
		
		//Formato de entrada
		DateTimeFormatter formatoDataEntrada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		//Data atual do sistema 
		LocalDate atualDate = LocalDate.now() ;
				
		
		
		if (!dataNascimento.matches(FORMATO_DATA_NASCIMENTO))
		{
			System.out.println("Data no formato invalido, por favor siga o padrão: dd/MM/yyyy");
			return false;
		}LocalDate dataNascimentoFormatada = LocalDate.parse(dataNascimento, formatoDataEntrada );
		
		//CALCULANDO A IDADE
		Period calculoData = Period.between(dataNascimentoFormatada, atualDate);
		int idadeAtual = calculoData.getYears();
				
		if (idadeAtual < 18)
		{
			System.out.println("Cliente tem dever ter 18 anos ou mais.");
			return false;
		}return true;
	}


	
	
	//VALIDAÇÃO DE NOME 
	private boolean validarNome(String nome) 
	/**
	 * Faz a validação de nome. Validando tamamho 
	 * e se o campo não é nulo.
	 */
	{
		if(!(nome.length() > 2) && !(nome.length() < 200) && nome != null )
		{
			return false;
		}return true;
	}
	
	
	
	
	


	//mostra o cliente 
	public  void mostrarCliente(String cpf )
	/**
	 * percorre base para vereficar se o cliente
	 * já não existe na base, considerando o cpf.
	 */
	{
	
		try {
			clienteDao.buscarCliente(cpf);
			//enderecoDao.buscaEndereco(uuid);
		} catch (Exception e) {
			System.out.println("Cliente inexistente. ");
		}
	}

	
	//ira buscar o cliente na base e setalo a conta
	public Cliente setarCliente(String cpf)
	/**
	 * Busca o cliente o cliente e caso
	 * o encontre na base o retorna para criação de conta. 
	 */
	{
		Cliente cli = clienteDao.setClite(cpf);
		if ( cli != null)
		{

			return cli;
		}
		return null;
	}
	 

	
}
