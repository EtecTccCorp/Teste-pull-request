package Exercicio_Heranca;

public class FuncionarioTeste {

	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		
		f.setNome("Funcionario");
		f.setCpf("666.666.888-77");
		f.setSalario(6000.00);
		f.setSenha(123);
		
	
		System.out.println(f.getNome());
		System.out.println(f.getCpf());
		
		
		System.out.println("Salario ="+f.getSalario());
		
		System.out.println("Bonificação= "+f.bonificacao());
		
		if (f.autentica((123))) {
			System.out.println("Senha correta");
		}else {
			System.out.println("Senha incorreta");
		}

		
		
		
	}

}
