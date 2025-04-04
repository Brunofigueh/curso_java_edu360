package b.com.cdb.bancodigitalfinal.entity;

public class ContaCorrente extends Conta{
	
	private String senha;
	private double taxaMensal;
	private double limeteCredito;
	private double limiteConta;
	private boolean statusCredito;
	private double taxaUsoCredito;
	private boolean seguroViagem = false;
	
	//Constructor
	public ContaCorrente() 
	{
		
		super();
		

	}

	
	@Override
	public String toString() {
		 Cliente cSv = new Cliente();
	    return "ContaCorrenteService{" +
	           "conta=" + getNumeroConta() + 
	           ", saldo=" + getSaldo() +
	           ", cliente=" + cSv.getNome() +
	           '}';
	}
	

	
	public double getLimeteCredito() 
	{
		return limeteCredito;
	}
	public double getLimiteConta() 
	{
		return limiteConta;
	}


	
	
	public void setLimeteCredito(double limeteCredito) 
	{
		this.limeteCredito = limeteCredito;
	}
	public void setLimiteConta(double limiteConta) 
	{
		this.limiteConta = limiteConta;
	}



	public String getSenha() 
	{
		return senha;
	}
	public void setSenha(String senha) 
	{
		this.senha = senha;
	}



	public double getTaxaMensal() 
	{
		return taxaMensal;
	}
	public void setTaxaMensal(double taxaMensal) 
	{
		this.taxaMensal = taxaMensal;
	}



	public boolean isStatusCredito() 
	{
		
		return statusCredito;
	}



	public void setStatusCredito(boolean statusCredito) 
	{
		this.statusCredito = statusCredito;
	}



	public double getTaxaUsoCredito() 
	{
		return taxaUsoCredito;
	}



	public void setTaxaUsoCredito(double taxaUsoCredito) 
	{
		this.taxaUsoCredito = taxaUsoCredito;
	}



	public boolean isSeguroViagem() 
	{
		return seguroViagem;
	}



	public void setSeguroViagem(boolean seguroViagem) 
	{
		this.seguroViagem = seguroViagem;
	}
	
	
	
}
