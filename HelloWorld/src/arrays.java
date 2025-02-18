import java.util.Scanner;
public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		/*Para criarmos um array declaramos o tipo e abrimos os couchetes
		 * - Porém em Java Array não são dinamicos então temos que definir o espaço 
		 * necessário que usaramos na declaração deste, chamando método new e declarando o espaço.
		 * ex: String[] array = new String[5];
		 * 
		 *  obss: Só podem ser armazenados objetos dos mesmo tipo. */
		
		String[] alunos = new String[4];
		
		//Caso definir o objeto na sua inicialização 
		//não será preciso construir o mesmo.
		int[] notas = {5,2,8,4,9,5,1,7,6,10};
		
		int maior = 0;
		int sMaior = 0;
		for(int i=0; i < notas.length; i++) {
			if(notas[i] > maior) {
				maior = notas[i];
			}
		}
		
		for(int y=0; y < notas.length; y++) {
			if(sMaior < maior)  {
				System.out.println("maior: "+maior);
				System.out.println("Segundo maior: "+notas[y]);
				System.out.println("--------------------------");
				if(notas[y] > sMaior && sMaior < maior)	{
					sMaior = notas[y];
				}
			}

		}
		System.out.println(maior);
		System.out.println(sMaior);
	
		
		alunos[0] = "José";
		alunos[1] = "Maria";
		alunos[2] = "João";
		alunos[3] = "Pedro";
		
		boolean starta = alunos[0].startsWith("J");
		System.out.println(starta);
		//System.out.println(alunos[0]);
		
		for(int i=0; i < alunos.length; i++) {
			//for irá percorer o tamanho da lista(alunos) 
			
			//percorer entrada para entrada:
			//alunos[i] = input.nextLine();
			
			//percorer para saida:
			//System.out.println(alunos[i]);
			
			/*if (alunos[i].startsWith("J")){
				System.out.println(alunos[i]);
			}*/
		}
	}

}

