package Exercicio_Heranca;

import javax.swing.JOptionPane;

public class GerenteTeste {

	public static void main(String[] args) {

		Gerente g = new Gerente();
		
		String txtNome = JOptionPane.showInputDialog("Informe o nome do gerente: ");
		String txtSalario = JOptionPane.showInputDialog("Informe o salario do gerente: ");
		String txtCpf = JOptionPane.showInputDialog("Informe o cpf do gerente: ");
		String txtSenha = JOptionPane.showInputDialog("Informe a senha do gerente: ");
		
		g.setNome(txtNome);
		g.setCpf(txtCpf);
		g.setSalario(Double.parseDouble(txtSalario));
		g.setSenha(Integer.parseInt(txtSenha));
		g.bonificacao();
		
		JOptionPane.showMessageDialog(null,g.getNome());
		JOptionPane.showMessageDialog(null,g.getCpf());
		JOptionPane.showMessageDialog(null,"Salario ="+g.getSalario());
		
		JOptionPane.showMessageDialog(null,"Bonificação= "+g.bonificacao());
		
		if (g.autentica(g.getSenha())) {
			JOptionPane.showMessageDialog(null,"Senha correta");
		}else {
			JOptionPane.showMessageDialog(null,"Senha incorreta");
		}
		
	}

}
