package b.com.cdb.bancodigitalfinal.entity;

public class Cliente {
	private String nome;
	private String cpf;
	private String dataNascimento;
	private String endereco;
	private int clienteID;
	
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public String getNome() 
	{
		return this.nome;
	}
	
	
	public void setCPF(String cpf)
	{
		this.cpf = cpf;
	}
	public String getCPF() 
	{
		return this.cpf;
	}
	
	
	public void setDataNasc(String dataNascimento)
	{
		this.dataNascimento = dataNascimento;
	}
	public String getDataNasc()
	{
		return this.dataNascimento;
	}
	
	
	public void setEndereco(String endereco)
	{
		this.endereco = endereco;
	}
	public String getEndereco()
	{
		return this.endereco;
	}
	
	
	public int getClienteID()
	{
		return this.clienteID;
	}
}
