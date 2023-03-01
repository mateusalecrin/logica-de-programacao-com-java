import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {

		// Fa�a um algoritmo que pe�a ao usu�rio 10 n�meros e mostre posteriormente
		// quantos s�o pares e a soma deles, bem como quantos s�o �mpares e a soma
		// deles.

		int[] numerosUsuario = new int[10];
		int restoNum;
		int qtdePares = 0;
		int somaPares = 0;
		int qtdeImpares = 0;
		int somaImpares = 0;

		JOptionPane.showMessageDialog(null, "Ol� usu�rio!", "In�cio", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Para fins de teste, informe 10 n�meros inteiros.", "Informa��es",
				JOptionPane.INFORMATION_MESSAGE);

		for (int i = 0; i < 10; i++) {
			numerosUsuario[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o: " + (+i + 1) + "� n�mero:"));
			restoNum = numerosUsuario[i] % 2;

			if (restoNum == 0) {
				qtdePares = qtdePares + 1;
				somaPares = somaPares + numerosUsuario[i];
			} else {
				qtdeImpares = qtdeImpares + 1;
				somaImpares = somaImpares + numerosUsuario[i];
			}
		}

		JOptionPane.showMessageDialog(null, "Quantidade de n�meros pares: " + qtdePares + "."
				+ "\nSoma dos n�meros pares: " + somaPares + "."
				+ "\n"
				+ "\nQuantidade de n�meros �mpares: " + qtdeImpares + "."
				+ "\nSoma dos n�meros �mpares: " + somaImpares + ".", "Resultados", JOptionPane.INFORMATION_MESSAGE);
	}

}
