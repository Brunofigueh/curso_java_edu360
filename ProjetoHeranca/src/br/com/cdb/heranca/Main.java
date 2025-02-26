package br.com.cdb.heranca;

import br.com.cdb.heranca.model.Aluno;
import br.com.cdb.heranca.model.Faxineiro;
import br.com.cdb.heranca.model.Pessoa;
import br.com.cdb.heranca.model.Professor;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Classe mãe pessoa
		Pessoa fulano = new Pessoa( "Fulano");
		System.out.println(fulano.toString());
		
//		fulano.nome = "Fulano";
		fulano.setCpf(1234567891);

		
//		fulano.apresentacao();
		
		//Classe Filho/a aluno
		
		Aluno aluno1 = new Aluno("Gabriela", 1223548);
		System.out.println(aluno1);
		
//		aluno1.nome = "Gabriela";
		aluno1.setCpf(1258963317);
//		aluno1.numeroMatricula = 2234578;
		
//		aluno1.apresentacao();
		
		Professor professor1 = new Professor("Raul");
//		professor1.nome = "Raul";
		professor1.setCpf(125487965);
		professor1.setSalario(5700.0);
		professor1.numeroDeAulas = 45;
//		professor1.apresentacao();

		Faxineiro funcs = new Faxineiro("Alberto");
		funcs.turno = "Diurno";
//		funcs.apresentacao();
		
		ArrayList<Pessoa> listaDaEscola = new ArrayList<>();
		listaDaEscola.add(professor1);
		listaDaEscola.add(aluno1);
		listaDaEscola.add(funcs);
		
		//System.out.println(listaDaEscola);
		
		for(Pessoa p: listaDaEscola) {
			p.apresentacao();
			
			if(p instanceof Professor) {
				//downcast --> ((Professor) p).numeroDeAulas
				//ele força o atroca de tipo de Pessoa que não tem acesso 
				//ao número de aulas, para Professor onde existe esse atributo.
				System.out.println("E tenho "+((Professor) p).numeroDeAulas+" de aulas.");
			}
		}
		/*DownCasting - ir a fundo a uma sub-classe para obter terminado
		 * método. para isso podemos usar o operador instanceof*/
	}
	
	
}
