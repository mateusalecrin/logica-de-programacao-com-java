import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		int[] varNumeros = new int[3];
		int menorNumero = 0;

		JOptionPane.showMessageDialog(null, "Ol� usu�rio!", "In�cio", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Para avalia��o de um sistema, informe 3 diferentes n�meros inteiros.",
				"Informa��es", JOptionPane.INFORMATION_MESSAGE);

		for (int i = 0; i < 3; i++) {
			/*
			 * boolean bOk = true;
			 * 
			 * do {
			 * 
			 * varNumeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o "
			 * +(i+1)+ "� n�mero:"));
			 * 
			 * switch (i) { case 1: if(varNumeros[i] == varNumeros[0]) { bOk = false; }
			 * break; case 2: if ((varNumeros[i] == varNumeros[0]) && (varNumeros[i] ==
			 * varNumeros[1])) { bOk = false; } break; } } while (!bOk);
			 */

			switch (i) {

				case 0:
					menorNumero = varNumeros[0];
					break;
				case 1:
					while (varNumeros[1] == varNumeros[0]) {
						varNumeros[i] = Integer.parseInt(JOptionPane.showInputDialog(
								" Este n�mero j� foi informado!" + " \n Informe o " + (i + 1) + "� n�mero novamente:"));
					}
					if ((varNumeros[i]) < (menorNumero)) {
						menorNumero = varNumeros[i];
					}
					break;
				case 2:
					while ((varNumeros[2] == varNumeros[0]) || (varNumeros[2] == varNumeros[1])) {
						varNumeros[i] = Integer.parseInt(JOptionPane.showInputDialog(
								" Este n�mero j� foi informado!" + " \n Informe o " + (i + 1) + "� n�mero novamente:"));
					}
					if ((varNumeros[i]) < (menorNumero)) {
						menorNumero = varNumeros[i];
					}
			}
		}
		JOptionPane.showMessageDialog(null, "O menor n�mero �: " + menorNumero, "Fim", JOptionPane.INFORMATION_MESSAGE);
	}
}
