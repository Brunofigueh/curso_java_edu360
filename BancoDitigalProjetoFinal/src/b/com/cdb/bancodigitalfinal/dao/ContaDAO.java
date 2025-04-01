package b.com.cdb.bancodigitalfinal.dao;

import java.util.ArrayList;

import b.com.cdb.bancodigitalfinal.entity.Conta;
import b.com.cdb.bancodigitalfinal.entity.ContaCorrente;
import b.com.cdb.bancodigitalfinal.entity.ContaPoucanca;

public class ContaDAO {
	
	ArrayList<Conta> contasDB = new ArrayList<>();
	
	public void criarCCorrente(ContaCorrente cc) 
	{
		contasDB.add(cc);
	}
	
	public void criarCPoupanca(ContaPoucanca cp)
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
		for(Conta c : contasDB)
		{
			System.out.println(c.getNumeroConta());
			System.out.println("To passando nessa merda");
			;
		}
	}
}
