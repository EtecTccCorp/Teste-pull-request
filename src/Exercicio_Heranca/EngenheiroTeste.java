package Exercicio_Heranca;

public class EngenheiroTeste {

	public static void main(String[] args) {
		Engenheiro e = new Engenheiro();
		
		e.setNome("Engenheiro");
		e.setCpf("555.555.555-88");
		e.setSalario(4444.00);
		e.setSenha(1234);
		//e.autentica();
		e.bonificacao();
		
		System.out.println(e.getNome());
		System.out.println(e.getCpf());
		System.out.println("Salario ="+e.getSalario());
		
		System.out.println("Bonificação= "+e.bonificacao());
		
		if (e.autentica((123))) {
			System.out.println("Senha correta");
		}else {
			System.out.println("Senha incorreta");
		}
		
		
		
	}

}
