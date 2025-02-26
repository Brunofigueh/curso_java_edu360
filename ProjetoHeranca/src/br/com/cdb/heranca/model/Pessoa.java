package br.com.cdb.heranca.model;

public abstract class Pessoa {
	//PROPRIEDADES
	protected String nome;
	protected long cpf;
	
	//class method constructor
	
	public Pessoa(String nome) {
		this.nome = nome;

	}
	
	//Setter
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	
	//Getters
	public String setNome() {
		return this.nome;
	}
	
	public long cpf() {
		return this.cpf;
	}
	
	
	
	//METODOS
	public void apresentacao() {
		System.out.println("Olá meu nome é "+ nome+ " e sou "+ Pessoa.class.getSimpleName());
	}
	
	
	@Override
	public String toString() {
		return this.nome+" - "+this.cpf;
		
	}


}
	
