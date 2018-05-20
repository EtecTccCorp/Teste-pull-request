package Exercicio_Heranca;

public class Engenheiro extends Funcionario {

	//Sobescrita do metodo autentica
	public boolean autentica(int senha) {
		return super.autentica(senha);
	}

}
