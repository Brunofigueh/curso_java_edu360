package br.com.cdb.bancodigitalsemana4;

public class ContaCorrente implements ContaBancaria {
	
	private double saldo;
	
	private final long numero;
	/*Ao atribuir "final" a um atributo ou componetes de um objeto (classes e métodos). Aquele valor 
	 * não poderá nunca mais ser medificado. logo é um valor constante.
	 * Nos casos de métodos ai atrubuir como final ele não porá ser
	 * sub-escrito ou sobrecarregado.
	 * Em classes final impede que ela tenha herdeiros*/
	
	//Constructor
	public ContaCorrente(long numero) {
		this.numero = numero;
	}

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
