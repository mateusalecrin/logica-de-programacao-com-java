import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {

		// Faça um programa que receba um vetor de valores e mostre a quantidade de
		// valores negativos. Os valores e o tamanho do vetor
		// devem ser informados pelo usuário.

		int qtdeNumerosSolicitado = 0;
		int qtdeNumerosNegativos = 0;
		JOptionPane.showMessageDialog(null, "Olá usuário!", "Início", JOptionPane.INFORMATION_MESSAGE);
		qtdeNumerosSolicitado = Integer.parseInt(JOptionPane.showInputDialog("Quantos números você vai informar?"));

		String numNegativos = "";
		int[] recebaNums = new int[qtdeNumerosSolicitado];
		boolean negativosSim = false;
		for (int i = 0; i < qtdeNumerosSolicitado; i++) {
			recebaNums[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + "º número:"));

			if (recebaNums[i] < 0) {
				negativosSim = true;
				qtdeNumerosNegativos += 1;
				if (numNegativos != "") {
					numNegativos += ", ";
				}
				numNegativos += recebaNums[i];
			}
		}
		if (negativosSim == true) {
			JOptionPane.showMessageDialog(null, "Quantidade de número(s) negativo(s): "
					+ qtdeNumerosNegativos
					+ "\nTais: " + numNegativos);
		} else {
			JOptionPane.showMessageDialog(null, "Não há números negativos.");
		}
	}
}
