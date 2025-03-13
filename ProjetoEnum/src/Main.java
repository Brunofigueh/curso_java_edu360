import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DiaDaSemana diaEnum;
		Scanner input = new Scanner(System.in);
		
		diaEnum =  DiaDaSemana.DOMINGO;
		
		System.out.println("Escolha o dia da semana: ");
		
		for(DiaDaSemana dia : DiaDaSemana.values() )  
		{
			System.out.println(dia);
		}
		String diaTexto = input.next().toUpperCase();
		
		diaEnum = DiaDaSemana.valueOf(diaTexto);
		
		System.out.println("O dia escolhido foi: "+diaEnum);
	}

}
