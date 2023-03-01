import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		// Escreva um programa que leia um n�mero inteiro e apresente um menu para o
		// usu�rio escolher:
		// Verificar se o n�mero � m�ltiplo de algum outro n�mero (pedir ao usu�rio esse
		// n�mero);
		// Verificar se o n�mero � par;
		// Verificar se o n�mero est� entre 0 e 1000;
		// Sair
		// Ap�s as entradas de dados, deve ser mostrado ao usu�rio o resultado da
		// respectiva op��o escolhida, e novamente o menu.
		// Para a op��o �4- Sair�, utilize System.exit(0);
		int numUsuario, numMultiplo, numResto, altMenu;
		boolean verificaCond = false;

		JOptionPane.showMessageDialog(null, "Ol� usu�rio!", "In�cio", JOptionPane.INFORMATION_MESSAGE);
		numUsuario = Integer.parseInt(JOptionPane.showInputDialog("N�mero inteiro:"));

		do {
			altMenu = Integer.parseInt(JOptionPane.showInputDialog("Menu:"
					+ "\n(Informe apenas o n�mero antes da op��o)."
					+ "\n"
					+ "\n1- Verificar se o n�mero � m�ltiplo de algum outro n�mero;"
					+ "\n2- Verificar se o n�mero � par;"
					+ "\n3- Verificar se o n�mero est� entre 0 e 1000;"
					+ "\n4- Sair."));

			switch (altMenu) {
				case 1:
					numMultiplo = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero a ser verificado:"));
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
