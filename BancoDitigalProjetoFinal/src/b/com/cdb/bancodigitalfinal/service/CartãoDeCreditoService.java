package b.com.cdb.bancodigitalfinal.service;
import b.com.cdb.bancodigitalfinal.entity.CategoriaDeClientes;
import b.com.cdb.bancodigitalfinal.entity.ContaCorrente;

public class CartãoDeCreditoService {
	/**
	 * @param ccs: Instance of CategoriaDeClientes to access client category.
	 * @param cc: Instance of b.com.cdb.bancodigitalfinal.entity.ContaCorente.
	 * 
	 */

	 // CARTÃO DE CREDITO 
	CategoriaDeClientes ccs;
	ContaCorrente cc = new ContaCorrente();
	
	public void ccCartaoCredito(double valor, double limiteCredito, boolean status)
	{
		/*Cartão de credito de conta corrente. 
		 * @valor: valor da translação.
		 *@limiteCredito: limite de credito 
		 *@status: se o cartão de credito esta habilitado ou não.
		 */
		
		if (statusCredito(status))
		{
			if ( valor <= limiteCredito)
			{
				limiteCredito -= valor;
			}
			System.out.println("Limite de credito insuficiênte.. ");
		}else
		{
			System.out.println("Função credito desativada.");
		}
		
	}
	
	
	public boolean statusCredito(boolean status)
	{
		/**
		 * Checa se o cartão de credito esta ativado ou desativado pelo úsuario.
		 * por default vem ativado. 
		 * 
		 * @param: cc, instância de ContaCorrente para acesso ao getter
		 * "isSatusCredito"
		 */

		
		if(cc.isStatusCredito() == false) {
			return false;
		}
		
		return true;
	}
		
	public double taxaUsoCretido(double valorGastoCredito, double limiteCredito)
	{
		double cotaTax = limiteCredito * 0.8;
		double aliquotaTax = valorGastoCredito * 0.5;
		if ( valorGastoCredito  >= cotaTax)
		{
			return aliquotaTax;
		}
		
		return 0.0;
	}
	
	public boolean seguroViagem(boolean choice )
	{
		if ( choice )
		{
			cc.setSeguroViagem(choice);
			return true;
		}
		return false;
	}
	
	public boolean checkSeguroViagem()
	{
		if(cc.isSeguroViagem())
		{
			return true;
		}
		return false;
	}
	
	public double seguroRoubo()
	{
		double valorSeguro = 5_000;
		 
		return valorSeguro;
	}
	
	
	public void faturaCartaoCredito(double saldo, double valorGastoCredito)
	{
		double valorAPagar ;
		
		CategoriaDeClientes limiteCred = ccs.defineCategoria(saldo);
		double limite = limiteCred.getLimiteCredito();
		double taxa = taxaUsoCretido(valorGastoCredito ,limite);
		if (checkSeguroViagem())
		{
			valorAPagar = limite +  taxa + 50;

		}else {
			valorAPagar = limite +  taxa;
		}
		
	
		
		
		System.out.println("===============================================");
		System.out.println("valor atual da Fatura: "+valorAPagar+"  Vencimento: xx/xx/xxxx");
		System.out.println("Credito Disponivel: "+ (limite - valorAPagar));
		
	}
}
