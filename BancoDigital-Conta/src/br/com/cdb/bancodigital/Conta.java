package br.com.cdb.bancodigital;

public class Conta {
	private int number; //number account
	private double balance; //balance account
	
	//Class method constructor
	public Conta(int number){
		this.number = number;
		this.balance = 0;
	}
	
	//number account getter 
	//getter
	public int getNumber() {
		return number;
	}
	
	
	//balance account getter e setter
	//getter 
	public double getBalance() {
		return balance;
	}
	
	//setter
	public void deposite(double valor) {
		if(valor > 0) {
			this.balance += valor;
		}
	}
	
}
