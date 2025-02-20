import java.util.ArrayList;
public class forEach {

	public static void main(String[] args) {
		
		ArrayList<Integer> listaDeNotas = new ArrayList();
		
		listaDeNotas.add(6);
		listaDeNotas.add(2);
		listaDeNotas.add(8);
		listaDeNotas.add(10);
		listaDeNotas.add(5);
		
		System.out.println("-----------For-----------------------");
		
		//for interando sobre cada elemento com método get()
		for(int i=0; i < listaDeNotas.size(); i++) {
			System.out.println(listaDeNotas.get(i));
		}
		
		System.out.println("----------ForEach---------------");
		
		//FOREACH ou for aprimorado
		for(Integer nota : listaDeNotas) {
			//para cada elemento nota : da listaDeNotas
			
			System.out.println(nota);
		}
	}

}
