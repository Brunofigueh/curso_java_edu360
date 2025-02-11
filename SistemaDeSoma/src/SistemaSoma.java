import java.util.Scanner;

public class SistemaSoma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		//ENTRADA DE DADOS
		
		
		int valor1, valor2; 
		
		System.out.println("Digite o primeiro némero: ");
		valor1 = input.nextInt();
		
		System.out.println("Digite o segundo némero: ");
		valor2 = input.nextInt();
		
		//PROCESSAMENTO DE DADOS
		
		int resultado = valor1 + valor2 ;
		
		if(valor1 > valor2) {
			System.out.println("Valor 1: " + valor1 + " é maior que valor 2: " + valor2);
		} else if(valor1 == valor2){
			System.out.println("Os dois valores digitados são iguais.. ");
		} else {
			System.out.println("Valor 2: " + valor2 + " é maior que valor 1: " + valor1);
		}
		
		
		// SAÍDA (FINALIZAÇÃO)
		int diaDaSemana = 1;
		
		// Como se escreve o switch
		switch (diaDaSemana) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2: 
			System.out.println("Segunda");
			break;
		case 3: 
			System.out.println("Terça");
			break;
		case 4: 
			System.out.println("quarta");
			break;
		case 5: 
			System.out.println("quinta");
			break;
		case 6: 
			System.out.println("Sexta");
			break;
		case 7: 
			System.out.println("Sabado");
			break;
			//caso contrario
		default: 
			System.out.println("Número da semana digitado errado..");
		}
		
		System.out.println("A soma do dois valores " + valor1 + " + " + valor2 + " é: " + resultado);
		
	}

}
