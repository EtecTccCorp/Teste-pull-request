package Exercicio_Heranca;

public class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	private int senha;
	
	public boolean autentica(int senha){
		if (senha == this.senha) {
			return true;
		}else {
			return false;
		}
		/*if (senha.equals("senha123")) {
			return "SENHA CORRETA.";
		} else {
			return "SENHA INCORRETA.";
		}*/
		
	}
	public double bonificacao() {
		return this.salario * 0.1;
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
}
