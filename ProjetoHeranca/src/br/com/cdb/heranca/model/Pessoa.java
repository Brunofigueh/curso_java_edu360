package br.com.cdb.heranca.model;

public class Pessoa {
	//PROPRIEDADES
	protected String nome;
	public long cpf;
	
	//class method constructor
	
	public Pessoa(String nome) {
		this.nome = nome;

	}
	
	//METODOS
	public void apresentacao() {
		System.out.println("Olá meu nome é "+ nome);
	}}
