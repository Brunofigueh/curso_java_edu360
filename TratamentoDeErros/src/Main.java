import java.text.ParseException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		
		int numero = 10; 
		int divisor;
		
		divisor = input.nextInt();
		
		// Try / catch
		try {
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divisor foi zero não é possível fazer essa operação");
		}
		catch(Exception t)
		{
			
		}
		
		
		int resultado = numero / divisor;
		
		
		/*
		 * step tracer: empilhamento de erros
		 * 
		 * 
		 * Existem dois tipos de exceções as verificadas 
		 * e não verificadas
		 * checked : exeções que você é obrigado a colocar em um try catch
		 * unchecked: exeções não verificadas que não são necessariamente obridas a se colocar em um try/catch
		 * como division by zero por exemplo. */
		
		
	}

}
