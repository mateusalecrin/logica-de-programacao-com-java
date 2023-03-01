import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		// Escreva um programa que leia um número inteiro e apresente um menu para o
		// usuário escolher:
		// Verificar se o número é múltiplo de algum outro número (pedir ao usuário esse
		// número);
		// Verificar se o número é par;
		// Verificar se o número está entre 0 e 1000;
		// Sair
		// Após as entradas de dados, deve ser mostrado ao usuário o resultado da
		// respectiva opção escolhida, e novamente o menu.
		// Para a opção “4- Sair”, utilize System.exit(0);
		int numUsuario, numMultiplo, numResto, altMenu;
		boolean verificaCond = false;

		JOptionPane.showMessageDialog(null, "Olá usuário!", "Início", JOptionPane.INFORMATION_MESSAGE);
		numUsuario = Integer.parseInt(JOptionPane.showInputDialog("Número inteiro:"));

		do {
			altMenu = Integer.parseInt(JOptionPane.showInputDialog("Menu:"
					+ "\n(Informe apenas o número antes da opção)."
					+ "\n"
					+ "\n1- Verificar se o número é múltiplo de algum outro número;"
					+ "\n2- Verificar se o número é par;"
					+ "\n3- Verificar se o número está entre 0 e 1000;"
					+ "\n4- Sair."));

			switch (altMenu) {
				case 1:
					numMultiplo = Integer.parseInt(JOptionPane.showInputDialog("Informe o número a ser verificado:"));
					numResto = (numUsuario % numMultiplo);
					if (numResto == 0) {
						verificaCond = true;
					}
					break;

				case 2:
					numResto = (numUsuario % 2);
					if (numResto == 0) {
						verificaCond = true;
					}
					break;

				case 3:
					if ((numUsuario > 0) && (numUsuario < 1000)) {
						verificaCond = true;
					}
					break;

				case 4:
					System.exit(0);
					// 0 Positivo 1 Negativo 2 Cancelar == true?
			}
			if (verificaCond == true) {
				JOptionPane.showMessageDialog(null, "Positivo.");
			} else {
				JOptionPane.showMessageDialog(null, "Negativo.");
			}
		} while (altMenu != 4);
	}
}
