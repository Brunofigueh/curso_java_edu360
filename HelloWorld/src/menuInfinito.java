import java.util.Scanner;
public class menuInfinito {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int opcao = 0;
		
		while(true) {
			
			System.out.println("1 - Deposito\n2 - Saldo\n3- SAIR");
			opcao = input.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("DEPOSITO");
				break;
			case 2:
				System.out.println("SALDO");
				break;
			case 3:
				System.out.println("PROGRAMA FINALIZADO COM SUCESSO!");
				break;
						
			}
			
			if(opcao == 3) {
				break;
			}
		}
	}

}
