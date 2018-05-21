package Exercicio_Heranca;

public class SecretarioTeste {

	public static void main(String[] args) {

		Secretario s = new Secretario();
		
		s.setNome("Gerente");
		s.setCpf("454.821.546.88");
		s.setSalario(1000);
		s.setSenha(1234);
		s.bonificacao();
		
		System.out.println(s.getNome());
		System.out.println(s.getCpf());
		System.out.println("Salario ="+s.getSalario());
		
		System.out.println("Bonificação= "+s.bonificacao());
		
		if (s.autentica((1234))) {
			System.out.println("Senha correta");
		}else {
			System.out.println("Senha incorreta");
		}
	}

}
