package Exercicio_Heranca;

public class Diretor extends Gerente{
	
	public double bonificacao() {
		return this.getSalario() * 0.1 + 1000 + 10000;
		
	}

}
