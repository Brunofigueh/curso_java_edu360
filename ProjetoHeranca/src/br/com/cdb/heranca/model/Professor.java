package br.com.cdb.heranca.model;

public class Professor extends Funcionario{

	public int numeroDeAulas;

	public Professor(String nome) {
		
		super(nome);
	}
	
	@Override
	public void apresentacao() {
		System.out.println("Olá meu nome é "+ nome+ " e sou "+ Professor.class.getSimpleName());
	}
		
	
	//SOBRECARGA DE MÉTODOS (POLIMORFISMO)
	/*
	 * Sobregaregando um método ou mudando o tipo do retorno do mesmo
	 * ou reescrevendo com número diferente de parametros*/
	
	public void  novoSalario(double novoSalario) {
		this.salario = novoSalario;
	}
	
	public void novoSalario(double novoSalario, int numAulasAdicional) {
		this.salario = novoSalario;
		this.numeroDeAulas += numAulasAdicional;
	}
}
