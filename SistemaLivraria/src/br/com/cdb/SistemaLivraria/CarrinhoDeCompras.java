package br.com.cdb.SistemaLivraria;

import java.util.ArrayList;

public class CarrinhoDeCompras {
	public ArrayList<Livro> livros = new ArrayList<>();
    private double tot = 0;

	public void calcularTotal() {
		System.out.println("-----------------Meu Carrinho-----------------");
		for(Livro l: livros) {
			if(l instanceof LivroFisico) {
				System.out.println("Livro: "+l.titulo+" - Valor: "+l.preco+" - Frete: "
			+((LivroFisico)l).getFrete()+ " - TOTAL: "+(((LivroFisico)l).preco+((LivroFisico)l).getFrete()));				
			}else{
				System.out.println("Livro: "+l.titulo+" - Valor: "+l.preco+" - Frete: Gratuito"+" - TOTAL: "+(l.preco));
			}
			tot += l.CalcularPrecoTotal();

			
			
		}
		System.out.println("VALOR TOTAL DO CARRINHO: " + tot);
		
	}
}
