package br.com.meuprojeto;

public class ContaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta conta = new Conta();
		conta.cliente = "Isadora Dantas";
		conta.saldo = 4000.00;
		conta.exibirSaldo();
		
//		conta.Sacar(2000);
//		conta.exibirSaldo();
//		
//		conta.Depositar(2770);
//		conta.exibirSaldo();
		
		Conta destino = new Conta();
		destino.cliente = "Carlos";
		destino.saldo = 5000.00;
		destino.exibirSaldo();
		
		conta.TransferirValor(destino, 150);
		
		conta.exibirSaldo();
		destino.exibirSaldo();

	}

}
