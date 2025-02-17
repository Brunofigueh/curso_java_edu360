package br.com.cdb.bancodigital;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta contaCorrente = new Conta(123456);
		contaCorrente.deposite(1_000);
		
		Conta contaPoupanca = new Conta(654321);
		contaPoupanca.deposite(500);
		
		System.out.println("Account Number: "+contaCorrente.getNumber()+
				". Has a balance of: "+contaCorrente.getBalance());
		
		System.out.println("Account Number: "+contaPoupanca.getNumber()+
				". Has a balacne of: "+contaPoupanca.getBalance());
	}

}
