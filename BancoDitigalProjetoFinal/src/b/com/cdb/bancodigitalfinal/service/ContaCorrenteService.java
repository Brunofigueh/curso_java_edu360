package b.com.cdb.bancodigitalfinal.service;

import java.util.Random;
import b.com.cdb.bancodigitalfinal.dao.ContaDAO;
import b.com.cdb.bancodigitalfinal.entity.CategoriaDeClientes;
import b.com.cdb.bancodigitalfinal.entity.Cliente;
import b.com.cdb.bancodigitalfinal.entity.Conta;
import b.com.cdb.bancodigitalfinal.entity.ContaCorrente;

public class ContaCorrenteService {
	/**
	 * @param cat: Enum de categoria de clietes. 
	 */
	
	CategoriaDeClientes  cat ;
	
	ContaDAO contaDao = new ContaDAO();

	
	public boolean criarCCorrente(Cliente cliente, String senha, double saldo) 
	{
		/**
		 * Criação de conta corrente e aplicação de regras de negocio. 
		 */
		
		
		if ( (cliente == null) )
		{
			return false;
		}
		if ( !validarSenha(senha) )
		{
			return false;
		}

		
		
	
		ContaCorrente cc = new ContaCorrente();
		cc.setCliente(cliente);
		cc.setSaldo(saldo);
		System.out.println(saldo);
		
		CategoriaDeClientes limites = CategoriaDeClientes.defineCategoria(saldo) ;
		System.out.println(limites);
		
		cc.setCategoria(limites);
		cc.setSenha(senha);
		cc.setTaxaMensal(limites.getTaxManutencao());
		cc.setLimiteConta(limites.getLimiteContaCC());
		cc.setLimeteCredito(limites.getLimiteCredito());
		
		long ccNum = geradorNumeroCC();
		cc.setNumeroConta(ccNum);
		
		contaDao.criarCCorrente(cc);
		
		
		return true;
	}

	
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
	
	

	//Saque em conta corrente
	public void sacar(double saldo, double valor)
	{	
		/*
		 * Método de saque em conta corrente considerando regras de negocio. 
		 * @limiteAtual: limite de conta corrente em cheque especial, é definido em cliente mas
		 * aqui é rechecado caso cliente tenho um valor maior em conta e tenha subido de categoria. 
		 * @limite é o valor do limite usado para calculo. 
		 * @diferencaValor: Será o novo valor da conta, que no calculo é acrescido 5% de juros. 
		 * 
		 */
		CategoriaDeClientes limiteAtual = cat.defineCategoria(saldo);
		double limite = limiteAtual.getLimiteContaCC();
		
		if (valor <= saldo ) {
			contaDao.sacar(saldo, valor);
		}
		else if (valor < saldo +  limite)
		{
			double diferencaValor = saldo - valor;
			saldo = diferencaValor + diferencaValor * 0.05;
		}
		else
		{
			System.out.println("Saldo insuficiente...");
		}
	}
	
	
	//Deposito conta corrente 
	
	public void depositar(double valor, double saldo)
	/**
	 * @param valor: valor a depositar
	 * @param: saldo: saldo da conta
	 */
	{
		saldo += valor;
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

	
	
	//Numero conta corrente
	
	public long geradorNumeroCC()
	{
		/**
		 * Método ira gerar o numero da conta corrente.
		 * 
		 * @param randons: Intância de Random para geração de números aleatorios.
		 * @param contaCorrentePrimaryDigts: Três primeiros números fixos das CC que são 301.
		 * @param contaCcSecundary: Responsavél por gerar os outros 7 números.
		 * @param numeroContaProvisorio: Número da conta em final em String.
		 * @param numeroGerado: Número gerado para conta conrrente. 
		 * @param numeroConta: Número da conta convertido para long
		 * 
		 * @return: retorna o número conta
		 */
		Random randons = new Random();
		String numeroGerado = "";
		String numeroContaProvisorio = "";
		
		
		
		String contaCorrentePrimaryDigts = "301";
		
		for (int i = 0; i < 7; i++)
		{
			int contaCcSecundary =  randons.nextInt(9);
			numeroGerado += contaCcSecundary;
		}
		System.out.println(numeroGerado);
		
		numeroContaProvisorio = contaCorrentePrimaryDigts + numeroGerado;
		
		
		long numeroConta = Long.parseLong(numeroContaProvisorio);
		
		return numeroConta;
	}


	public void mostraContasCorrentes() {
		 contaDao.listarContas();
		
	}

	
	
	//listar contas
	
	

	
			
}
