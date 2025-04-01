package b.com.cdb.bancodigitalfinal.service;

import java.util.Random;
import java.util.stream.LongStream;

import b.com.cdb.bancodigitalfinal.dao.ContaDAO;
import b.com.cdb.bancodigitalfinal.entity.CategoriaDeClientes;
import b.com.cdb.bancodigitalfinal.entity.Cliente;
import b.com.cdb.bancodigitalfinal.entity.Conta;
import b.com.cdb.bancodigitalfinal.entity.ContaPoupanca;

public class ContaPoupancaService {
	/**
	 * @param cat: Enum de categoria de clietes. 
	 */
	

	ContaDAO contaDao = new ContaDAO();
	
	public boolean criarCPoupanca(Cliente cliente, String senha, double saldo)
	{
		if ( (cliente == null) )
		{
			return false;
		}
		if ( !validarSenha(senha) )
		{
			return false;
		}

		
		CategoriaDeClientes limites = CategoriaDeClientes.defineCategoria(saldo);
		
		ContaPoupanca cp = new ContaPoupanca();
		cp.setCliente(cliente);
		cp.setCategoria(limites);
		cp.setSenha(senha);
		cp.setLimeteCredito(limites.getLimiteCredito());
		cp.setTaxaRendimentoAnual(limites.getTaxAnual());
		
		long cpNum = geradorNumeroCP();
		cp.setNumeroConta(cpNum);
		
		contaDao.criarCPoupanca(cp);
		return true;
	}
	
	
	//VALIDAÇÃO DE SENHA 
	public boolean validarSenha(String senha)
	{
		/**
		 * validação simples de senha
		 */
		if (senha ==  null || senha.length() != 8)
		{
			return false;
		}
		
		return true;
	}
	
	//SAQUE DE VALORES 
	public void sacar(double saldo, double valor)
	{	
		/*
		 * Método de saque em conta Poupança considerando regras de negocio. 
		 * 
		 */
		
		if (valor <= saldo ) {
			contaDao.sacar(saldo, valor);
		}
		else
		{
			System.out.println("Saldo insuficiente...");
		}
	}
	
	

	//DOSITO EM CONTA POUPANÇA 
	
	public void depositar(double valor, double saldo)
	{
		saldo += valor;
	}
	
	//GERADOR DE NÉMERO DE CONTA POUPAÇA
	public long geradorNumeroCP()
	{
		/**
		 * Método ira gerar o numero da conta corrente.
		 * 
		 * @param randons: Intância de Random para geração de números aleatorios.
		 * @param contaPoupancaPrimaryDigts: Três primeiros números fixos das CP que são 302.
		 * @param contaPpSecundary: Responsavél por gerar os outros 7 números.
		 * @param numeroGerado: Número gerado para conta conrrente. 
		 * @param numeroConta: Número da conta convertido para long
		 * 
		 * @return: retorna o número conta
		 */
		Random randons = new Random();
		String numeroGerado = "";
		String numeroContaProvisorio = "";
		
		
		String contaPoupancaPrimaryDigts = "302";
		
		for (int i = 0; i < 7; i++)
		{
			int contaPpSecundary =  randons.nextInt(9);
			numeroGerado += contaPpSecundary;
		}
		
		numeroContaProvisorio = contaPoupancaPrimaryDigts +numeroGerado;
		
		long numeroConta = Long.parseUnsignedLong(numeroContaProvisorio);
		System.out.println(numeroConta);
		
		return numeroConta;
	}
	
	//TRANFERENCIAS 
	public void transfereciaPix(double valor, double saldo, long numeroConta)
	{
		
		if( contaDao.contaCheck(numeroConta) && saldo >= valor)
		{
			Conta contaRecebedora = contaDao.buscaConta(numeroConta);
			double saldoCR = contaRecebedora.getSaldo();
			
			depositar(valor, saldoCR) ;

		}else {
				System.out.println("Não foi possível fazer sua transferência."
						+ "Por favor confira o número da conta e o saldo.");
			}
	}
	

	
	//EXIBIR CONTAS POUPANÇAS 
	public void mostraContasPoupancas() {
		 contaDao.listarContas();
		
	}

	public Conta getContas()
	{
		Conta c = contaDao.contaFinder();
		return c;
	}

}
