import java.util.ArrayList;
import java.util.List;
public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*List / ArrayList coleção do java para manipulação de listas.
		 * É necessario importar a coleção do java.util:
		 * ArrayList é uma implementação dinâmica de listas em java */
		
		//Criação de um novo objeto ArrayList
		ArrayList<String> listaDeCompras = new ArrayList<>();
		
		//Método que adiociona um elemento novo ao final da lista
		listaDeCompras.add("Arroz");
		listaDeCompras.add("Feijão");
		listaDeCompras.add("Farinha");
		listaDeCompras.add("Ovo");
		
		//teste add posicional
		//listaDeCompras.add(0,"Bolacha");
		
		//pegando elemento da lista desejada pelo método get
		System.out.println(listaDeCompras.get(1));
		
		listaDeCompras.remove(1);
		System.out.println(listaDeCompras.get(1));
	}

}
