import java.util.Scanner;

public class raiseExpt {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double resultado = 0;
		
		try{
			resultado = divisao(10, 2);
		}
		catch (DivisaoPorZeroException e) {
			resultado = 10/e.getValorPadrao();
		}
		finally{
			System.out.println("Resultado: "+resultado);
		}
	}

	private static double divisao(int i, int j) throws DivisaoPorZeroException {
		double  result = i / j;
		
		if(j == 0) 
		{
			throw new DivisaoPorZeroException("Divisão por zero!");
		}
		
		return result;
	}

}
