package br.com.cdb.SistemaLivraria;

public class Livro {
	protected String titulo;
	protected String autor;
	protected String isbn;
	protected double preco;
	protected double total = 0.0;
	
	//Constructor method
	public Livro(String titulo, String autor, String isbn, double preco) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.preco = preco;
	}

	
	//Getter/Setter
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	

	public double CalcularPrecoTotal() {
		
		total+=preco;
		return total;
	}
	
	@Override
	public String toString() {
		return this.titulo+" - "+this.autor+" - "+this.isbn+" - "+this.preco;
	}

}
