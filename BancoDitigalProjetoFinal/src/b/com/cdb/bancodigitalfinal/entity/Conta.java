package b.com.cdb.bancodigitalfinal.entity;

public class Conta {
	
		private long numeroConta;
		private double saldo;
		private Cliente cliente;
		private CategoriaDeClientes  categoria;
		
	
		
		
		public CategoriaDeClientes getCategoria() {
			return categoria;
		}

		
		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}

		public void setCategoria(CategoriaDeClientes categoria) {
			this.categoria = categoria;
		}

		public Cliente getCliente() {
			return cliente;
		}
		public long getNumeroConta() 
		{
			return numeroConta;
		}
		public void setNumeroConta(long ccNum) 
		{
			this.numeroConta = ccNum;
		}
		
		
		public double getSaldo() 
		{
			return saldo;
		}
		protected void setSaldo(double saldo) 
		{
			this.saldo = saldo;
		}
		
		
		
		
		

}
