import java.util.Scanner;

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
		
		int idade;
		
		System.out.println("Escreva sua idade: ");
		
		idade = input.nextInt();
		
		System.out.println("Minha idade é " + idade);
	}

}
