package b.com.cdb.bancodigitalfinal.service;

import java.util.ArrayList;
import java.util.Collections;

import b.com.cdb.bancodigitalfinal.dao.ClienteDAO;
import b.com.cdb.bancodigitalfinal.entity.Cliente;

public class ClienteService {

	ClienteDAO clienteDao = new ClienteDAO();
	
	public boolean addCliente(String nome, String cpf, String dataNascimento, String endereco)
	{
		if (!validarNome(nome))
		{
			return false;
		}
		
		
		if (!validarCPF(cpf)) 
		{
			return false;
		}
		
		if (!validarDataNasc(dataNascimento))
		{
			return false;
		}
		
		if (!validarEndereco(endereco))
		{
			return false;
		}
			
			
	}
	
	
	
	public boolean validarNome(String nome) 
	{
		if(nome.length() > 2 && nome.length() < 200 )
		{
			return true;
		}
		
		return false;
	}
	
	
	
	//VALIDAÇÃO DE CPF 
	
	//Digito 1
	int primeiroDigito;
	
	//Digito 2
	int segundoDigito;
	
	//lista para armazenar 9 primeiros digitos
	ArrayList<Integer> cpfValid1 = new ArrayList<>();
	
	public boolean validarCPF(String cpf)
	{	
		//valida o formato do cpf passado pelo cliente.
		if(cpf != "^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$") 
		{
			return false;
		}
		
		String cpfF = cpf.strip().replace(".", "").replace("-", "");
		
		//9 primeiros digitos do CPF
		String vCpf1 = cpfF.substring(0, 9);
		
		//primeiro digito do cpf
		String dCpf1 = cpfF.substring(10, 11);
		
		//segundo digito do cpf
		String dCpf2 = cpfF.substring(11, 12);
		
		
		
		//Fasendo conversão para inteiro da primeira parte do cpf, os nove digitos;
		try {


			for(char num : vCpf1.toCharArray())
			{
				//Converte o num char para um inteiro e assim ser armazenado na lista
				int number = num - '0';
				
				cpfValid1.add(number);
				
			}
		}catch (Exception e) {
			System.out.println("Erro de cast fase 1.");
		}
		
		
		//Convertendo primeiro Digito do Cpf
		int dCpf1_ = 0;

		
		try {
			dCpf1_ = Integer.parseInt(dCpf2.strip());
		}catch (Exception e) {
			System.out.println("Erro de cast fase 2.");
		}
		
		//Convertendo segundo Digito do cpf
		int dCpf2_ = 0;
		
		try {
			dCpf2_ = Integer.parseInt(dCpf2.strip());
		}catch (Exception e) {
			System.out.println("Erro de cast fase 3.");
		}	
		
		if (!(primeiroDigito == dCpf1_) && !(segundoDigito == dCpf2_))
		{
			return false;
		}
		
		return true;
	}
	
	
	//Calcuculo primeiro digito
	private int tot1 = 0;
	
	public int calculoDig1()
	{
		//resto da divisão
		int rest =0;
		
		Collections.reverse(cpfValid1);
		
		for(int i=2; i <= 10; i++ )
		{
			for(int j= 0; j < cpfValid1.size(); j++)
			{
				tot1 += j * 1;
			}
		}
		
		rest = tot1 % 11;
		
		if( rest < 2)
		{
			primeiroDigito = 0;
			return primeiroDigito;
		}
		primeiroDigito = 11 - rest;
		
		cpfValid1.add(primeiroDigito);
		return primeiroDigito;	
	}
	
	
	//CALCULO SEGUNDO DIGITO
	private int tot2 = 0;
	
	public int calculoDig2()
	{
		//resto da divisão
		int rest =0;
		
		Collections.reverse(cpfValid1);
		
		for(int i=2; i <= 11; i++ )
		{
			for(int j= 0; j < cpfValid1.size(); j++)
			{
				tot2 += j * 1;
			}
		}
		
		rest = tot2 % 11;
		
		if( rest < 2)
		{
			segundoDigito = 0;
			return segundoDigito;
		}
		segundoDigito = 11 - rest;
		
		return segundoDigito;	
	}
	
	
}
