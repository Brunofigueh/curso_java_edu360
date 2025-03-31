package b.com.cdb.bancodigitalfinal.dao;

import java.util.ArrayList;

import b.com.cdb.bancodigitalfinal.entity.Cliente;
import b.com.cdb.bancodigitalfinal.entity.Endereco;

public class EnderecoDAO {
	ArrayList<Endereco> enderecoDB =new ArrayList<>();
	
	Cliente cliente = new Cliente();
	
	public void addEndereco(Endereco endereco)
	{
		enderecoDB.add(endereco);
	}
	
	
}
