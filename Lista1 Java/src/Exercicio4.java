import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {

		// Fa�a um algoritmo que mostre a soma de todos os valores pares entre o
		// intervalo de dois n�meros digitados pelo usu�rio.

		int valorUm;
		int valorDois;
		int restoNum;
		int somaPares = 0;

		// Porque quando n�o defino "somaPares=0" aparece na linha 31 "The local
		// variable somaPares may not have been initialized" ?

		JOptionPane.showMessageDialog(null, "Ol� usu�rio!", "In�cio", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Para avalia��o de um algor�tmo de c�lculos, informe 2 n�meros inteiros.",
				"Informa��es", JOptionPane.INFORMATION_MESSAGE);
		valorUm = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro n�mero:"));
		valorDois = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo n�mero:"));

		if (valorUm > valorDois) {
			int inverterNum = valorUm;
			valorUm = valorDois;
			valorDois = inverterNum;
		}
		for (int i = (valorUm + 1); i < valorDois; i++) {
			restoNum = i % 2;
			if (restoNum == 0) {
				somaPares = (somaPares + i);
			}
		}
		JOptionPane.showMessageDialog(null, somaPares, "Resultado", JOptionPane.INFORMATION_MESSAGE);
	}
}