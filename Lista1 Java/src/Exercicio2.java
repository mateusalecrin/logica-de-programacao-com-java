import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idadeBase;
		int idadeUsuario;

		JOptionPane.showMessageDialog(null, "Ol� usu�rio!", "In�cio", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Qual a maioridade civil de seu estado/pa�s?");

		idadeBase = Integer.parseInt(JOptionPane.showInputDialog("Qual a maioridade civil de seu estado/pa�s?"));

		// De acordo com uma busca sobre a maioridade civil a idade m�xima registrada �
		// 21 e a m�nima 15.
		while ((idadeBase > 21) || (idadeBase < 15)) {
			idadeBase = Integer.parseInt(
					JOptionPane.showInputDialog("Por favor insira uma idade v�lida.", JOptionPane.WARNING_MESSAGE));
		}

		idadeUsuario = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade?"));

		while (idadeUsuario <= 0) {
			idadeUsuario = Integer.parseInt(
					JOptionPane.showInputDialog("Por favor insira uma idade v�lida.", JOptionPane.WARNING_MESSAGE));
		}

		if (idadeUsuario >= idadeBase) {
			JOptionPane.showMessageDialog(null, "Voc� � maior de idade!", "Fim", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Voc� � menor de idade!", "Fim", JOptionPane.INFORMATION_MESSAGE);
		}
	}

}