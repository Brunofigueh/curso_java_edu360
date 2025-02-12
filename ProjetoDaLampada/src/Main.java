
public class Main {

	public static void main(String[] args) {
		
		//Lampada() é o método construtor
		Lampada minhaLampada = new Lampada(20);
		
		Lampada outraLampada = new Lampada(60);
	
		
		
		//minhaLampada.potencia = 20;
		minhaLampada.ligar();
		
		//outraLampada.potencia = 60;
		outraLampada.desligar();
		
		System.out.println("Minha lampada de "+minhaLampada.getPotencia()+" está ligada? "+minhaLampada.isLigado());
		
		System.out.println("Minha lampada de "+outraLampada.getPotencia()+" está ligada? "+outraLampada.isLigado());
		
		/*
		 * Modificaderes de acesso, ou encapsulamento um dos três pilares de programação orientada a objetos.
		 * São eles :
		 * 		public - todos tem acesso
		 * 		default - não se define nenhuma modificador então se torna publico automaticamente
		 * 		protected - acessivel no mesmo escopo, pacote ou por herençã
		 * 		private -  é acesssivel apenas no escopo da classe ou a método a qual foi atribuído. 
		 * */
	}

}
