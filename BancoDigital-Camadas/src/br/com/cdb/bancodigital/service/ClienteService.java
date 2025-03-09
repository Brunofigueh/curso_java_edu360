package br.com.cdb.bancodigital.service;

import br.com.cdb.bancodigital.dao.ClienteDAO;
import br.com.cdb.bancodigital.entity.Cliente;

public class ClienteService {
	
	/*
	 * Aqui aplicando as regras de negocio.
	 * validação*/
	
	ClienteDAO clienteDao = new ClienteDAO();
	//deve ser único não pode ser criado mais vezes e sim compartilhado entre as camadas.
	
	
	public boolean addCliente(String nome, String cpf)
	{
		if(!validarCPF(cpf))
		{
			return false;
		}
		
		if(!validarNome(nome))
		{
			return false;
		}
		
		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		cliente.setCpf(cpf);
		
		clienteDao.addCliente(cliente);
		
		return true;
		
	}
	
	
	private boolean validarNome(String nome) 
	{
		
		return true;
	}
	
	
	private boolean validarCPF(String cpf) 
	{
		return true;
	}
}
