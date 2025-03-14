
public class ConversãoDeTiposJava {

	public static void main(String[] args) {
		//Conversão implicita
		int a = 10;
		float b = a;

		//Conversão Explicita
		
		//CAST
		float c = 10.5f;
		int d = (int) c; //Casting (cast) 
		// é uma conversão forçada, estamos garantindo 
		//que esse número sera convertirdo para aquele tipo
		//neste dado momento do código.

		//Um dos riscos do CAST é que apesar de converter ele pode perder informações
		//ou converter a erros de execução com conversões impropias. 
		
		
		//PARSING
		String texto = "150";
		String texto2 = "200";
		
		int t = Integer.parseInt(texto); 
		int t2 = Integer.parseInt(texto2);
		
		
		
		
		System.out.println(t + t2);
	}

}
