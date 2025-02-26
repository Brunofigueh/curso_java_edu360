package br.com.cdb.bancodigitalsemana4;

public class ContaCorrente implements ContaBancaria {
	
	private double saldo;

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public boolean sacar(double valor) {
		if(saldo >= valor) {
			saldo -= valor;
			return true;
		}
		return false;
	}

	@Override
	public void transferir(double valor, ContaBancaria destino) {
		if(sacar(valor)) {
			destino.depositar(valor);
		}
	}

	@Override
	public double getSaldo() {
				
		return saldo;
	}
	

	
}
