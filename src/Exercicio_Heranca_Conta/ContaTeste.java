package Exercicio_Heranca_Conta;

public class ContaTeste {

	public static void main(String[] args) {

		Conta c = new Conta();
		
		c.setNome("Jean");
		c.setNumero(123456);
		System.out.println("Nome = "+c.getNome());
		System.out.println("Numero = "+c.getNumero());
		c.saque(10.0);
	}

}
