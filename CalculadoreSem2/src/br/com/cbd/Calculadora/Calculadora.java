package br.com.cbd.Calculadora;

public class Calculadora {
	String calc;
	
	//Class Method Constructor
	Calculadora(){
	
		
	}
	
	
	
	private double sum(double n1, double n2) {
		return n1 + n2;
	}
	
	private double sub(double n1, double n2) {
		return n1 - n2;
	}
	
	private double div(double n1, double n2) {
		return n1 / n2;
	}
	
	private double mult(double n1, double n2) {
		return n1 * n2;
	}

	

	
	public void calcular(double n1, double n2, String operator) {
		/*
		 * Calculate four basic math operations
		 * - will return a print of calculation*/
		
		// Convert a input to char at 0 position of String 
		char operator_ = operator.charAt(0);
		
		//Change in the math operator 
		switch(operator_){
		case '+':
			// will make the sum
			double soma = sum(n1 , n2);
			System.out.println(soma);;
			break;
		case '-':
			//will make a subtraction 
			double subtraction = sub(n1, n2);
			System.out.println(subtraction);
			break;
		case '/':
			// will make a division
			if(n2 == 0) {
				System.out.println("Error Number division by zero");
				break;
			}
			double division = div(n1, n2);
			System.out.println(division);
			break;
		case '*':
			//will make a multiplication
			double multiplication = mult(n1, n2);
			System.out.println(multiplication);
			break;
		default:
			// will check if the operator is not supported.
			System.out.println("Invalid operator: "+operator_+ ". Please chose: +, - , / , *");
		}
	}
}	

