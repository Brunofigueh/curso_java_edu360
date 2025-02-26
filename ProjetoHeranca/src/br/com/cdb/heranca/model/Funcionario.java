package br.com.cdb.heranca.model;

public class Funcionario extends Pessoa{
	
	protected double salario;
	
	//Constructor class method
	public Funcionario(String nome) {
		super(nome);
	}
	
	//Setter and getter
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getSalario() {
		return this.salario;
	}
}
