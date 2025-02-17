import java.util.Scanner;
public class OperadoresLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		
		//OPERADORES LÓGICOS
		/*
		 * E (AND) é representado por &&
		 * OU (OR) é representadp por ||
		 * NEGAÇÃO (NOT) é representado por !
		 * 
		 */
		/*- UNÁRIUO : 
		 * 	pós fixados - primeiro ela ira pegar o valor a ser incrementado,
		 * só depois então fara a adição.
		 */
		int valor_pos = 3;
		
		//aqui pega o valor
		System.out.println("Pagando a valor da variavel no pós fixado: "+valor_pos++);
		//aqui posteriormente o incremento do valor devolvendo este.
		System.out.println("Valor adicionado pós fixado: "+valor_pos);
		
		//pre fixado - Ele primeiro fara a operação e depois devolve o valor.
		int valor_pre = 5; 
		System.out.println("Pegou valor e foi feita a operação no pre fixado: "+ ++valor_pre);
		
		//usando mesmo exemplo do prós fixado, porém o resultado será o mesmo pois a execução é feita previamente
		System.out.println("Valor pré fixado: "+ valor_pre);
		
		/*TERNARIO CONDICIONAL
		 * resume o if esle em uma única linha
		 */
		
		String texto = "";
		int age = 13;
		
		age += 5;
		
		texto = (age >= 18) ? "Maior de idade" : "Menor de idade";
		
		System.out.println(texto);

	}

}
