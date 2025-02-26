package br.com.cdb.heranca.model;

public class Aluno extends Pessoa {
	
	public long numeroMatricula;
	
	public Aluno(String nome, long numeroMatricula) {
		
		super(nome);
		this.numeroMatricula = numeroMatricula;
	}
	
	
	
}
