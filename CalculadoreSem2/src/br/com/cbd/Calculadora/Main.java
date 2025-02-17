package br.com.cbd.Calculadora;


public class Main {

	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora();
		
		System.out.println("sum");
		calculadora.calcular(10, 2, "+");
		System.out.println("------------------------------------");
		
		System.out.println("Subtraction");
		calculadora.calcular(10,2, "-");
		System.out.println("------------------------------------");
		
		System.out.println("division");
		calculadora.calcular(10,2, "/");
		System.out.println("------------------------------------");
		
		System.out.println("Multiplication");
		calculadora.calcular(10,2, "*");
		System.out.println("------------------------------------");
		
		System.out.println("Non supported operator");
		calculadora.calcular(10,2, "%");

	}

}
