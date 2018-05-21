package Exercicio_Heranca_Conta;

public class JuridicaTeste {

	public static void main(String[] args) {
		Juridica j = new Juridica();
		
		j.setNome("Armando");
		j.setCnpj("23132123");
		j.setNumero(12154654);
		
		
		System.out.println("Nome"+j.getNome());
		System.out.println("CNPJ"+j.getCnpj());
		System.out.println("Numero conta"+j.getNumero());
		j.saque(200);

	}

}
