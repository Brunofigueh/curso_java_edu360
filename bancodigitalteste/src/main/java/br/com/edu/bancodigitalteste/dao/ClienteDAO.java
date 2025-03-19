package br.com.edu.bancodigitalteste.dao;

import java.util.ArrayList;

import br.com.edu.bancodigitalteste.entity.Cliente;

public class ClienteDAO {
	
	ArrayList<Cliente> listaDeClientes = new ArrayList<Cliente>();
	
	
	public void save(Cliente cliente)
	{
		listaDeClientes.add(cliente);
	}
	
	public ArrayList<Cliente> listALL()
	{
		return listaDeClientes;
	}
	
}
