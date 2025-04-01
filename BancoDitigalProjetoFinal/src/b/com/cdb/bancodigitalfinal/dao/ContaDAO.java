package b.com.cdb.bancodigitalfinal.dao;

import java.util.ArrayList;

import b.com.cdb.bancodigitalfinal.entity.Conta;
import b.com.cdb.bancodigitalfinal.entity.ContaCorrente;
import b.com.cdb.bancodigitalfinal.entity.ContaPoucanca;
import b.com.cdb.bancodigitalfinal.entity.ContaPoupanca;

public class ContaDAO {
	
	ArrayList<Conta> contasDB = new ArrayList<>();
	
	public double consultaSaldo()
	{	
		double saldo = 0;
		for(Conta account: contasDB)
		{
			saldo = account.getSaldo();
			
		}
		return saldo;
	}
	
	public void criarCCorrente(ContaCorrente cc) 
	{
		contasDB.add(cc);
	}
	
	public void criarCPoupanca(ContaPoupanca cp)
	{
		contasDB.add(cp);
	}
	
	public void sacar(double saldo, double valor)
	{
		saldo -= valor;
	}
	
	public void depositar(double valor, double saldo)
	{
		
		saldo += valor;
	}

	public void ccCartaoCredito(double valor, double limiteCred)
	{
		limiteCred -= valor;
	}
	
	public void transfereciaPix(double valor, double saldo)
	{
		saldo -= valor;
	}
	
	
	public boolean contaCheck(long numeroContaAreceber) 
	{
		for(Conta contas : contasDB)
		{
			long numCheck = contas.getNumeroConta();
			if ( numCheck == numeroContaAreceber)
			{
				return true;
			}
		}
		
		return false;
	}
	
	
	public Conta buscaConta(long numConta)
	/**
	 * Busca a conta na base de dados 
	 */
	{
		for(Conta c : contasDB)
		{
			if (c.getNumeroConta() == numConta)
			{
				return c;
			}
		}
		
		return null;
	}
	
	public void listarContas()
	{
		try
		{
			for(Conta c : contasDB)
			{
				System.out.println("Numero "+c.getClass().getSimpleName()+": "+c.getNumeroConta());

			}
		}
		catch(Exception e)
		{
			System.out.println("Némero de conta não encontrado. ");
			
		}
		
	}
	
	public Conta contaFinder()
	{
		try
		{
			for(Conta c : contasDB)
			{
				return c;

			}
		}
		catch(Exception e)
		{
			System.out.println("Némero de conta não encontrado. ");
			
		}return null;
	}
	
}
