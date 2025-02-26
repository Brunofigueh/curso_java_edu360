package br.com.cdb.heranca.model;

public class Aluno extends Pessoa {
	
	public long numeroMatricula;
	
	//Class method constructor
	public Aluno(String nome, long numeroMatricula) {
		
		super(nome);
		this.numeroMatricula = numeroMatricula;
	}
	
	//SOBESCRITA DE MÉTODOS
	/*
	 * PARA MODIFICAR COMPORTAMENTO DE UM MÉTODO PODE SOBESCREVE-LO
	 * Para isso usamos uma palavra especial @Overide*/
	
		@Override
		public void apresentacao() {
			System.out.println("Olá meu nome é "+ nome+ " e sou "+ Aluno.class.getSimpleName());
		}
		
	
	
	
	
}
