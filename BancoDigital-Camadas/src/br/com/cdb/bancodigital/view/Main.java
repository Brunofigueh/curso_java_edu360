package br.com.cdb.bancodigital.view;

import br.com.cdb.bancodigital.service.ClienteService;

public class Main {
	 
	public static void main(String[] args)
	{
		
		String nome = "Fulano";
		String cpf = "12345678912";
		
		String nome2 = "Fulano ax";
		String cpf2 =  "21987456321";
		
		ClienteService clienteService = new ClienteService();
		
		if(clienteService.addCliente(nome, cpf))
		{
			System.out.println("Cliente adicionado com sucesso!");
		}
		else {
			System.out.println("Houve um erro ao tentar adicionar esse cliente. ");
		}
		
		
		if(clienteService.addCliente(nome2, cpf2))
		{
			System.out.println("Cliente adicionado com sucesso!");
		}
		else {
			System.out.println("Houve um erro ao tentar adicionar esse cliente. ");
		}
	}
}
