package br.com.cdb.heranca;

import br.com.cdb.heranca.model.Aluno;
import br.com.cdb.heranca.model.Faxineiro;
import br.com.cdb.heranca.model.Pessoa;
import br.com.cdb.heranca.model.Professor;

public class Main {

	public static void main(String[] args) {
		
		
		// Classe mãe pessoa
		Pessoa fulano = new Pessoa( "Fulano");
		
//		fulano.nome = "Fulano";
		fulano.cpf = 1234567891;
		
		fulano.apresentacao();
		
		//Classe Filho/a aluno
		
		Aluno aluno1 = new Aluno("Gabriela", 1223548);
		
//		aluno1.nome = "Gabriela";
		aluno1.cpf = 1258963317;
//		aluno1.numeroMatricula = 2234578;
		
		aluno1.apresentacao();
		
		Professor professor1 = new Professor("Raul");
//		professor1.nome = "Raul";
		professor1.cpf = 125487965;
		professor1.salario = 5700.0;
		professor1.numeroDeAulas = 45;
		
		Faxineiro funcs = new Faxineiro("Alberto");
		funcs.turno = "Diurno";
		
		
	}

}
