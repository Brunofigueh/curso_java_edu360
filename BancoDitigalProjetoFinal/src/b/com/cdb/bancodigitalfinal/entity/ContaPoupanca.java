package b.com.cdb.bancodigitalfinal.entity;


public class ContaPoupanca extends Conta{
	
	private String senha;
	private double taxaRendimentoAnual;
	private double limeteCredito;
	private boolean statusCredito;
	private double taxaUsoCredito;
	private boolean seguroViagem = false;
	
	

	@Override
	public String toString() {
		 Cliente cSv = new Cliente();
	    return "ContaPoupancaService{" +
	           "conta=" + getNumeroConta() + 
	           ", saldo=" + getSaldo() +
	           ", cliente=" + cSv.getNome() +
	           '}';
	}
	
	
	
	public String getSenha() 
	{
		return senha;
	}
	public void setSenha(String senha) 
	{
		this.senha = senha;
	}
	
	
	public double getTaxaRendimentoAnual() 
	{
		return taxaRendimentoAnual;
	}
	public void setTaxaRendimentoAnual(double taxaRendimentoAnual) 
	{
		this.taxaRendimentoAnual = taxaRendimentoAnual;
	}
	
	
	public double getLimeteCredito() 
	{
		return limeteCredito;
	}
	public void setLimeteCredito(double limeteCredito) 
	{
		this.limeteCredito = limeteCredito;
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
