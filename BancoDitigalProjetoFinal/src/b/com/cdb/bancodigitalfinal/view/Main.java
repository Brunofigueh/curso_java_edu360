package b.com.cdb.bancodigitalfinal.view;
import b.com.cdb.bancodigitalfinal.entity.Endereco;
import b.com.cdb.bancodigitalfinal.service.ClienteService;
import b.com.cdb.bancodigitalfinal.service.ContaCorrenteService;
import b.com.cdb.bancodigitalfinal.service.ContaPoupancaService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClienteService cliente = new ClienteService();
		ContaCorrenteService cc = new ContaCorrenteService();
		ContaPoupancaService cp = new ContaPoupancaService();
		
		Endereco endereco1 = new Endereco();
		endereco1.setRua("Rua Sabia");
		endereco1.setCidade("Embu");
		endereco1.setEstado("São Paulo");
		endereco1.setNumero(200);
		endereco1.setCep("06805-00");
		
		
		Endereco endereco2 = new Endereco();
		endereco2.setRua("Rua Periquito");
		endereco2.setCidade("Taboão da Serra");
		endereco2.setEstado("São Paulo");
		endereco2.setNumero(410);
		endereco2.setCep("05705-00");
		
		
		
		//cliente.validarEndereco("Rua Sabia",2000, "Embu", "São Paulo", "06805-00");
		
		String nome = "Bruno F" ;
		String cpf = "958.101.230-31";
 		String dataNasc = "11/03/1989";
		
		String nome2 = "Maria Algusta";
		String cpf2 = "814.247.680-04";
		String dataNasc2 = "25/11/1990";
		
		//cliente.addCliente(nome, cpf, dataNasc, endereco);
		
		if(cliente.addCliente(nome, cpf, dataNasc, endereco1) != null)
		{
			 System.out.println("Cliente Adicionado"+"\n");
			;
		}else {
			System.out.println("Erro ao acidionar "+nome+"\n");
		}
		
		;
		
		if(cliente.addCliente(nome2, cpf2, dataNasc2, endereco2) != null)
		{
			 System.out.println("Cliente2 Adicionado"+"\n");
		}else {
			System.out.println("Erro ao acidionar "+nome2+"\n");
		}
	
		//System.out.println(validar.validarCPF(cpf));
		
	//#####################################################################################################################################################################
		//CRIAÇÃO DE CONTAS
		if (cc.criarCCorrente(cliente.setarCliente(cpf), "12345678", 5001))
		{
			System.out.println("OK");
	
		
		}else {
			System.out.println("error");
		}
		//System.out.println(Arrays.toString(cc.getClass().getDeclaredFields()));
		if (cc.criarCCorrente(cliente.setarCliente(cpf2), "87654321", 2500))
		{
			System.out.println("OK");
	
		
		}else {
			System.out.println("error");
		}
		
		
		if (cp.criarCPoupanca(cliente.setarCliente(cpf), "12345678", 5001))
		{
			System.out.println("OK");
	
		
		}else {
			System.out.println("error");
		}
		
		
		//#############################################################################################################################################################################
	
		cc.mostraContasCorrentes();
		cp.mostraContasPoupancas();
		
		//#############################################################################################################################################################################
		//  TRANFERÊNCIAS / DEPOSITOS
		
		cp.depositar(500, 3025214162L);
		
	 
	} 
	
	
	
}
