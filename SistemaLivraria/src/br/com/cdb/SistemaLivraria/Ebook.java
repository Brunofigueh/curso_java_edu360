package br.com.cdb.SistemaLivraria;

public class Ebook extends Livro{
	
	private double tamanhoEmMb;
	
	//Constructor method
	Ebook(String titulo, String autor, String isbn,
			double preco, double tamanhoEmMb){
		
		super(titulo, autor,isbn,preco);
		
		this.tamanhoEmMb = tamanhoEmMb;	
	}
	
	//Getter/Setter
	public void setTamanhoEmMb(double tamanhoEmMb) {
		this.tamanhoEmMb = tamanhoEmMb;	
	}
	public double getTamanhoemMb() {
		return this.tamanhoEmMb;
	}
	
	@Override
	public String toString() {
		return this.titulo+" - "+this.autor+" - "+this.isbn+" - "+this.preco+" - "+this.tamanhoEmMb;
	}


}
