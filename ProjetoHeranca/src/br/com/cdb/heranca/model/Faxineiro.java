package br.com.cdb.heranca.model;

public class Faxineiro extends Funcionario{

	public String turno;

	public Faxineiro(String nome) {
		super(nome);
	}
	
	
	@Override
	public void apresentacao() {
		System.out.println("Olá meu nome é "+ nome+ " e sou "+ Faxineiro.class.getSimpleName());
	}
	
}
