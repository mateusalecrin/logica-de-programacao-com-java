import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {

		// Faça um algoritmo que peça ao usuário 10 números e mostre posteriormente
		// quantos são pares e a soma deles, bem como quantos são ímpares e a soma
		// deles.

		int[] numerosUsuario = new int[10];
		int restoNum;
		int qtdePares = 0;
		int somaPares = 0;
		int qtdeImpares = 0;
		int somaImpares = 0;

		JOptionPane.showMessageDialog(null, "Olá usuário!", "Início", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Para fins de teste, informe 10 números inteiros.", "Informações",
				JOptionPane.INFORMATION_MESSAGE);

		for (int i = 0; i < 10; i++) {
			numerosUsuario[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o: " + (+i + 1) + "º número:"));
			restoNum = numerosUsuario[i] % 2;

			if (restoNum == 0) {
				qtdePares = qtdePares + 1;
				somaPares = somaPares + numerosUsuario[i];
			} else {
				qtdeImpares = qtdeImpares + 1;
				somaImpares = somaImpares + numerosUsuario[i];
			}
		}

		JOptionPane.showMessageDialog(null, "Quantidade de números pares: " + qtdePares + "."
				+ "\nSoma dos números pares: " + somaPares + "."
				+ "\n"
				+ "\nQuantidade de números ímpares: " + qtdeImpares + "."
				+ "\nSoma dos números ímpares: " + somaImpares + ".", "Resultados", JOptionPane.INFORMATION_MESSAGE);
	}

}
