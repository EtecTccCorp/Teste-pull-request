package Exercicio_Heranca;

public class Gerente extends Funcionario {
	
//	Funcionario f = new Funcionario();

	public double bonificacao() {
		return this.getSalario() * 0.1 + 1000;
		
	}
	
}
