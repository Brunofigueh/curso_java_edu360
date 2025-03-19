package b.com.cdb.bancodigitalfinal.dao;

import java.util.ArrayList;

import b.com.cdb.bancodigitalfinal.entity.Cliente;

public class ClienteDAO {
	
	ArrayList<Cliente> clienteDB = new ArrayList<>();

	public void addCliente(Cliente cliente) 
	{
		clienteDB.add(cliente);
	}
	
}
