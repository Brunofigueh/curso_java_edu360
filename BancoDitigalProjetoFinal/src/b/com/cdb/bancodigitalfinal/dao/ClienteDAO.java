package b.com.cdb.bancodigitalfinal.dao;

import java.util.ArrayList;

import b.com.cdb.bancodigitalfinal.entity.Cliente;

public class ClienteDAO {
	
	
	private  ArrayList<Cliente> clienteDB = new ArrayList<>();

	public void addCliente(Cliente cliente) 
	{
		clienteDB.add(cliente);
	}
	
	
	//Busca os dados do cliente
	public void buscarCliente(String cpf)
	{
		for ( Cliente cliente : clienteDB)
		{
			if ( cliente.getCPF().matches(cpf) ) 
			{
				System.out.println(
						"Nome: "+ cliente.getNome()
						+"\n"+
						"CPF: "+ cliente.getCPF()
						+"\n"+
						"Data de Nascimento: "+ cliente.getDataNasc()
						+"\n"+
						"Rua: "+ cliente.getEndereco().getRua()+" , "+cliente.getEndereco().getNumero()
						+"\n"+
						"Cidade: "+ cliente.getEndereco().getCidade()
						+"\n"+
						"Estado: "+ cliente.getEndereco().getEstado()
						+"\n"+
						"CEP: "+ cliente.getEndereco().getCep()
						);
						break;
			}else{
				System.out.println("Cliente não encontrado");
			     }
		}
	}
	
	
	//Busca se o cpf já existe na base
	public boolean cpfCheck(String cpf)
	{
		for(Cliente c: clienteDB)
		{
			if (c.getCPF() == cpf) 
			{
				return true;
			}
		}
		
		return false;
	}
	
}
