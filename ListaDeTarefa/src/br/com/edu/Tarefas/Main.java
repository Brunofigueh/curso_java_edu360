package br.com.edu.Tarefas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;



public class Main {

		

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		// OPÇÃO PARA PARADA DE EXECUÇÃO DO MENU
		int options = 0;
		String tarefas;

		// CRIANDO TAREFAS
		Tarefas listaTarefas = new Tarefas();

		// PROGRAMA CENTRAL
		while (options != 6) {
			System.out.println("----------------LISTA DE TAREFAS------------------");
			System.out.println("SELECIONE UMA DA OPÇÕES: ");
			//LISTANDO OPÇÕES
			System.out.println("1 - ADICIONAR TAREFA\n"+ 
			                   "2 - ROMEVER TAREFA\n"+ 
					           "3 - LISTAR TAREFA\n"+ 
			                   "4 - LISTAR EM ORDERM ALFABERICA\n"+ 
					           "5 - LISTAR ORDEM CRONOLÓGICA\n"+ 
			                   "6 - SAIR");
			//IRÁ RECEBER A ENTRADA DO USUÁRIO
			options = input.nextInt();
			input.nextLine();
			
			//SELECIONARÁ AS OPÇÕES DISPONÍVEIS
			switch (options) {
			case 1:
				System.out.print("Digite a tarefa: ");
				tarefas = input.nextLine();
				listaTarefas.addTask(tarefas);
				break;
			case 2:
				//REMOVE UMA TAREFE ESPECIFICA
				listaTarefas.listedTasks();
				System.out.println("DIGITE A TAREFA A SER DELETADA:");
				options = input.nextInt();
				options -= 1;
				System.out.println("options here: "+ options);
				String opt= " ";
				System.out.println("DESEJA DELETAR ESSA TAREFA? (S/N)");
				//ENTRADA DO USUÁRIO
				opt = input.next();
				
				//VARÍAVEL PARA PEGAR O PRIMEIRA LETRA COMO CHAR
				char optt = opt.charAt(0);
				if(optt == 'S' || optt == 's') {
					listaTarefas.delTask(options);
				}
				break;
			case 3:
				//LISTA TAFEFAS POR ORDEM DE INSERÇÃO
				listaTarefas.listedTasks();
				break;
			case 4:
				//LISTA EM ORDEM ALFABÉTICA
				listaTarefas.sortdTask();
				break;
			case 5:
				//LISTA EM ORDEM CRONOLÓGICA  EXIBINDO DATA E HORARIO
				listaTarefas.chroSort();
				break;
			case 6:
				// SAI DO PROGRAMA
				System.out.println("FIM DO PROGRAMA!");
				options = 6;
				break;
			default:
				System.out.println("ESCOLHA ENTRE UMA DAS OPÇÕES LISTADAS!!");
			}
			
			//options = 0;
		}

	}
}