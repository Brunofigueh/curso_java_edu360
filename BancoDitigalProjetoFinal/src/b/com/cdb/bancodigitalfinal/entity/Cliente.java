package b.com.cdb.bancodigitalfinal.entity;

import java.util.UUID;

public class Cliente {
	private String nome;
	private String cpf;
	private String dataNascimento;
	private Endereco endereco;
	private UUID clienteID;
	
	
	
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
	
	
	
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public UUID getClienteID()
	{
		return this.clienteID;
	}
	public void setClienteID(UUID clienteID) {
		this.clienteID = clienteID;
	}
}
