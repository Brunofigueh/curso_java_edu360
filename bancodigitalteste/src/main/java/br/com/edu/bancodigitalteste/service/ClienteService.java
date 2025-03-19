package br.com.edu.bancodigitalteste.service;

import java.util.ArrayList;

import br.com.edu.bancodigitalteste.dao.ClienteDAO;
import br.com.edu.bancodigitalteste.entity.Cliente;

public class ClienteService {
	
	private ClienteDAO clienteDao = new ClienteDAO();
	
	public void addCliente(String nome, long cpf)
	{	
		//VALIDAR CPF
		//VALIDAR NOME 
		Cliente cliente = new Cliente(nome, cpf);
		clienteDao.save(cliente);
		
	}
	
	public ArrayList<Cliente> getCliente()
	{
		return clienteDao.listALL();
	}
	
}
