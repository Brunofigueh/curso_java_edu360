package br.com.cdb.bancodigitalsemana4;

public class ContaPoupanca implements ContaBancaria {
	private double saldo;
	
	private double rendimento;

	@Override
	public void depositar(double valor) {
		saldo += valor;
		
	}

	@Override
	public boolean sacar(double valor) {
		if(saldo >= valor) {
			valor += 1;
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
