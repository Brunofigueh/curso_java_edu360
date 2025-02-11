import java.util.Scanner;
public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int num1, num2;
		
		
		System.out.println("Digite o primeiro valor: ");
		num1 = input.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		num2 = input.nextInt();
		
		System.out.println("Escolha a operação Matematica.");
		System.out.println("+ ::> Soma\n"
				+ "- ::> Subtração\n"
				+ "/ ::> Divisão\n"
				+ "* ::> Multiplicação\n");
		System.out.print("Digite a opção escolhida: ");
		String escolha = input.next();
		char escolhas = escolha.charAt(0);
		
		switch(escolhas) {
		case '+':
			System.out.println(num1+ " + " + num2 + " = " + (num1 + num2));
			break;
		case '-':
			System.out.println(num1+ " - " + num2 + " = " + (num1 - num2));
			break;
		case '/':
			System.out.println(num1+ " / " + num2 + " = " + (num1 / num2));
			break;
		case '*':
			System.out.println(num1+ " * " + num2 + " = " + (num1 * num2));
			break;
		default: 
			System.out.println("ERRO!!! Digite uma opção valida");
		}
			
	}

}
;