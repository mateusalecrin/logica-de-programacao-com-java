import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {

		// Faça um algoritmo que mostre a soma de todos os valores pares entre o
		// intervalo de dois números digitados pelo usuário.

		int valorUm;
		int valorDois;
		int restoNum;
		int somaPares = 0;

		// Porque quando não defino "somaPares=0" aparece na linha 31 "The local
		// variable somaPares may not have been initialized" ?

		JOptionPane.showMessageDialog(null, "Olá usuário!", "Início", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Para avaliação de um algorítmo de cálculos, informe 2 números inteiros.",
				"Informações", JOptionPane.INFORMATION_MESSAGE);
		valorUm = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número:"));
		valorDois = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número:"));

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