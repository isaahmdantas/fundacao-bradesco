package br.com.meuprojeto;

public class Conta {
	String cliente;
	double saldo;
	
	void exibirSaldo() {
		System.out.println(cliente + " seu saldo é " + saldo);
	}
	
	void Sacar(double valor) {
		saldo -= valor;
	}
	
	void Depositar(double valor) {
		saldo += valor;
	}
	
	void TransferirValor(Conta destino, double valor) {
		this.Sacar(valor);
		destino.Depositar(valor);
	}

}
