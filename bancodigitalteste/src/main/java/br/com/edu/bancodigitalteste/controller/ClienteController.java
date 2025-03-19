package br.com.edu.bancodigitalteste.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.edu.bancodigitalteste.entity.Cliente;
import br.com.edu.bancodigitalteste.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	private ClienteService clienteService = new ClienteService();
	
	@PostMapping("/add/{nome}/{cpf}")
	public void addCliente(@PathVariable String nome, @PathVariable long cpf)
	{
		clienteService.addCliente(nome, cpf);
		
	}
	
	@PostMapping("/add")
	public void addCliente(@RequestBody Cliente cliente)
	{
		clienteService.addCliente(cliente.getNome(), cliente.getCPF());
	}
	
	@GetMapping("/all")
	public ArrayList<Cliente> getAllClients()
	{
		return clienteService.getCliente();
	}

	
}
