import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class HelloWorld {

	public static void main(String[] args) {
		/*int idade;
		idade = 35;
		
		char simbol = '$';
		
		String texto = "Laura"; 
		System.out.println(texto);
		
		boolean bool = true;
		
		
		
		System.out.println("Olá mundo..");
		// TODO Auto-generated method stub
		 
		 */
		Scanner input = new Scanner(System.in);
		
		int idade = 15;
		
		String nome;
		
		//while 
		System.out.println(" ------------ Whiel ---------------");
		
		int contador = 1;
		
		while(contador <= 10) {
			System.out.println(contador);
			contador++;
		}
		/*
		 * Usamos geralmente quando é indefinido o tempo de execução do loop
		 */
		
		//for
		System.out.println("----------- For ---------------");
		
		for(int cont=1; cont<=10; cont++){
			System.out.println(cont);
		}
		
		/*
		 * Usamos for quando sabemos quando termina o loop geralmente
		 */
		
		//System.out.println("Escreva sua idade: ");
		
		//idade = input.nextInt();
		
		//System.out.println("Minha idade é " + idade);
		
		
		/*while(idade < 18) {
			System.out.println("É menor de idade. ");
			idade++;
		}
		System.out.println("Maior de idade. "); */
		System.out.println("Insira seu nome: ");
		nome = input.nextLine();
		
		while(nome.equals("".strip())) {
			System.out.println("Você precisa escrever seu nome: ");
			nome = input.nextLine();
		}
	}

}
