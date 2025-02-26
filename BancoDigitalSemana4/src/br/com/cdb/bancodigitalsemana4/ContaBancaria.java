package br.com.cdb.bancodigitalsemana4;

public interface  ContaBancaria {
	
	public  void depositar(double valor);
	
	public   boolean sacar(double valor);
	
	public  void transferir(double valor, ContaBancaria destino);
	
	public  double getSaldo();
}
