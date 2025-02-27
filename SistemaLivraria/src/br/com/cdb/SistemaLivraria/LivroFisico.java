package br.com.cdb.SistemaLivraria;

public class LivroFisico extends Livro{
	private double peso = 0;
	private double frete= 0;
	

	LivroFisico(String titulo, String autor, String isbn,
				double preco, double peso, double frete){
		
		super(titulo, autor, isbn, preco);
		
		this.peso = peso;
		this.frete = frete;
		
		
	}
	
	//Getter/Setter
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getPeso() {
		return this.peso;
	}
	
	
	public void setFrete(double frete) {
		this.frete = frete;
	}
	public double getFrete() {
		return this.frete;
	}
	
	
	@Override
	public double CalcularPrecoTotal() {
			
			
			preco = preco + frete;
			total+=preco;
			return total;
		}
	
	@Override
	public String toString() {
		return this.titulo+" - "+this.autor+" - "+this.isbn+" - "+this.preco+" - "+this.peso+" - "+this.frete;
	}

	
	
}
