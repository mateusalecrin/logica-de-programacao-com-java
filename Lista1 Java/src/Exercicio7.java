import javax.swing.JOptionPane;

public class Exercicio7 {

	public static void main(String[] args) {

		// Faça uma solução que alimente um vetor com 10 valores inteiros e também que
		// solicite ao usuário a entrada de dados de um
		// valor inteiro qualquer. A solução deverá fazer uma busca do valor, informado
		// pelo usuário, no vetor e imprima a posição
		// em que este foi encontrado ou se não foi encontrado.

		int[] valoresVet = new int[10];
		int respostaUsu;
		String posicaoNum = "";
		JOptionPane.showMessageDialog(null, "Olá usuário!", "Início", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Informe 10 números inteiros no campor a seguir.", "Informações",
				JOptionPane.INFORMATION_MESSAGE);
		for (int i = 0; i < 10; i++) {
			valoresVet[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + " número:"));
		}

		respostaUsu = Integer.parseInt(JOptionPane.showInputDialog("Agora informe um outro número inteiro:"));

		for (int i = 0; i < 10; i++) {
			if (respostaUsu == valoresVet[i]) {
				if (posicaoNum != "") {
					posicaoNum += ", ";
				}
				posicaoNum += (i + 1);
			}

		}
		JOptionPane.showMessageDialog(null,
				"Número " + respostaUsu + " encontrado na(s) posição(ões) " + posicaoNum + ".");
	}
}