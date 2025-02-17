
public class Lampada {
	//PROPRIEDADES
	private int potencia;
	boolean ligado;
	
	//METODO CONSTRUTOR
	public Lampada(int potencia) {
		this.potencia = potencia;
		this.ligado = false;
	}
	
	
	//METODOS GETTERS E SETTERS
	
	//getter
	public int getPotencia() {
		return potencia;
	}
	
	/*
	//setter
	public void setPotencia(int potencia) {
		// regras de negocio
		this.potencia = potencia;
	}
	*/
	//getter
	public boolean isLigado() {
		return ligado;
	}
	
	/*
	//setter
	public void setLigado(boolean ligado) {
		this.ligado = ligado;		
	}
	*/
	
	//METODOS
	public void ligar() {
		ligado = true;
	}
	
	public void desligar() {
		ligado = false;
	}
}
