import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idadeBase;
		int idadeUsuario;

		JOptionPane.showMessageDialog(null, "Olá usuário!", "Início", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Qual a maioridade civil de seu estado/país?");

		idadeBase = Integer.parseInt(JOptionPane.showInputDialog("Qual a maioridade civil de seu estado/país?"));

		// De acordo com uma busca sobre a maioridade civil a idade máxima registrada é
		// 21 e a mínima 15.
		while ((idadeBase > 21) || (idadeBase < 15)) {
			idadeBase = Integer.parseInt(
					JOptionPane.showInputDialog("Por favor insira uma idade válida.", JOptionPane.WARNING_MESSAGE));
		}

		idadeUsuario = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade?"));

		while (idadeUsuario <= 0) {
			idadeUsuario = Integer.parseInt(
					JOptionPane.showInputDialog("Por favor insira uma idade válida.", JOptionPane.WARNING_MESSAGE));
		}

		if (idadeUsuario >= idadeBase) {
			JOptionPane.showMessageDialog(null, "Você é maior de idade!", "Fim", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Você é menor de idade!", "Fim", JOptionPane.INFORMATION_MESSAGE);
		}
	}

}