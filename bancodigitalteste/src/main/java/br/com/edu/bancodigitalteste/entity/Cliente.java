package br.com.edu.bancodigitalteste.entity;

public class Cliente {

	private String nome;
	private long cpf;

	public Cliente(String nome, long cpf) 
	{
		this.nome = nome;
		this.cpf = cpf;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	
	
	public void setCPF(long cpf) {
		this.cpf =cpf;
	}
	public long getCPF() {
		return cpf;
	}
	

}
