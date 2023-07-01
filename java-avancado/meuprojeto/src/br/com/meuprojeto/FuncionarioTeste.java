package br.com.meuprojeto;

public class FuncionarioTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Fulano de Tal");
		funcionario.setAtivo(true);
		
		System.out.println("Nome do Funcionário: " + funcionario.getNome());
		
		if(funcionario.isAtivo()) {
			System.out.println("Está ativo!");
		} else {
			System.out.println("Nao está ativo!");
		}

	}

}
