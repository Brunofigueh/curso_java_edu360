package b.com.cdb.bancodigitalfinal.entity;

public enum CategoriaDeClientes {

	COMUM(12.00 , 0.5, 300, 500),
	SUPER(8.00, 0.7, 1500, 2000), 
	PREMIUN( 8.00, 0.9, 3000, 5000);
	
	
	private final double taxAnual;
	private final double taxManutencao;
	private final double limiteContaCC;
	private final double limiteCredito;
	
	



	CategoriaDeClientes(double taxAnual, double taxManutencao, double limiteContaCC, double limiteCredito)
	{
		this.taxAnual = taxAnual;
		this.taxManutencao = taxManutencao;
		this.limiteContaCC = limiteContaCC;
		this.limiteCredito = limiteCredito;
	}





	public double getLimiteContaCC() {
		return limiteContaCC;
	}





	public double getLimiteCredito() {
		return limiteCredito;
	}





	public double getTaxAnual() {
		return taxAnual;
	}





	public double getTaxManutencao() {
		return taxManutencao;
	}
	
	
	public static CategoriaDeClientes defineCategoria(double saldo)
	{
		/**
		 * Define categoria de clientes conforme o saldo em conta. 
		 * @param comum: clientes comuns com saldo <=1_000
		 * @param super: Clientes super com saldo <=5_000
		 * @param premium: Cliente premium com  saldo superior a 10_000
		 */

		
		if (saldo < 4_999)
		{
			return COMUM;

		}else if(saldo <= 5_000)
		{
			return SUPER;
			
		}else
			{
			return PREMIUN;
			}
	}
	
}
