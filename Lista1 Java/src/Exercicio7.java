import javax.swing.JOptionPane;

public class Exercicio7 {

	public static void main(String[] args) {

		// Fa�a uma solu��o que alimente um vetor com 10 valores inteiros e tamb�m que
		// solicite ao usu�rio a entrada de dados de um
		// valor inteiro qualquer. A solu��o dever� fazer uma busca do valor, informado
		// pelo usu�rio, no vetor e imprima a posi��o
		// em que este foi encontrado ou se n�o foi encontrado.

		int[] valoresVet = new int[10];
		int respostaUsu;
		String posicaoNum = "";
		JOptionPane.showMessageDialog(null, "Ol� usu�rio!", "In�cio", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Informe 10 n�meros inteiros no campor a seguir.", "Informa��es",
				JOptionPane.INFORMATION_MESSAGE);
		for (int i = 0; i < 10; i++) {
			valoresVet[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + " n�mero:"));
		}

		respostaUsu = Integer.parseInt(JOptionPane.showInputDialog("Agora informe um outro n�mero inteiro:"));

		for (int i = 0; i < 10; i++) {
			if (respostaUsu == valoresVet[i]) {
				if (posicaoNum != "") {
					posicaoNum += ", ";
				}
				posicaoNum += (i + 1);
			}

		}
		JOptionPane.showMessageDialog(null,
				"N�mero " + respostaUsu + " encontrado na(s) posi��o(�es) " + posicaoNum + ".");
	}
}