package Exercicio_Heranca;

public class DiretorTeste {

	public static void main(String[] args) {
		Diretor d = new Diretor();
		
		d.setNome("Diretor");
		d.setCpf("455.555.555-85");
		d.setSalario(5000.00);
		d.setSenha(123);
		
		//d.autentica("senha");
		//d.bonificacao();
		
		System.out.println(d.getNome());
		System.out.println(d.getCpf());
		
		System.out.println("Salario= "+d.getSalario());
		System.out.println("Bonificação= "+d.bonificacao());
		
		if (d.autentica((123))) {
			System.out.println("Senha correta");
		}else {
			System.out.println("Senha incorreta");
		}
	
		
	}

}
