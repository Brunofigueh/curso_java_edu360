package br.com.cdb.SistemaLivraria;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		
		//EBOOK
		Ebook e1 = new Ebook("Vida silvetres","Dr. Rubens","an12454",35.9, 100);
		Ebook e2 = new Ebook("Como Enfiquercer sendo preguiçoso","Criancã Cout 01","an12454",18, 90);
		
		
		//LIVROFISICO
		LivroFisico lf = new LivroFisico("Java Básico ", "Milton Cauvis", "an5289", 279.9, 0.5, 12);
		LivroFisico lf2 = new LivroFisico("Intrudoção a Estruturas de dados", "Rafael Ventura", "an5289", 315, 0.7, 6.5);
		
		carrinho.livros.add(e1);
		carrinho.livros.add(e2);
		carrinho.livros.add(lf);
		carrinho.livros.add(lf2);
		
		carrinho.calcularTotal();
		//System.out.println(total);
		

	}

}
