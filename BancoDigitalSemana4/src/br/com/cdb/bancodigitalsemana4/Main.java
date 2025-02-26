package br.com.cdb.bancodigitalsemana4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaBancaria cc = new ContaCorrente();
		cc.depositar(1000);
		
		ContaBancaria cp = new ContaPoupanca();
		cp.depositar(500);
		
		cc.depositar(500);
		cp.sacar(200);
		cc.transferir(300, cp);
		
		System.out.println("Saldo da conta Corrente: "+cc.getSaldo());
		
		System.out.println("Saldo da conta Poupança: "+cp.getSaldo());
	}

}
