import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Exercicio2 {

	public static void main(String[] args) {

		// Escreva um programa que receba quatro notas do aluno e as insira em um vetor.
		// Depois, calcule a média aritmética entre as
		// quatro notas e mostre o "conceito" do aluno conforme as instruções:
		// 9.0 ou maior = Conceito A
		// entre 8.0 e 8.9 = Conceito B
		// entre 7.0 e 7.9 = Conceito C
		// menor que 7.0 = Conceito D

		double[] notasAluno = new double[4];
		double mediaNotas = 0;
		char conceito = 'O';
		DecimalFormat df = new DecimalFormat("0.00");

		JOptionPane.showMessageDialog(null, "Olá usuário!", "Início", JOptionPane.INFORMATION_MESSAGE);

		for (int i = 0; i < 4; i++) {
			notasAluno[i] = Double.parseDouble(JOptionPane.showInputDialog((i + 1) + "ª nota:"));

			while ((notasAluno[i] > 10.0) || (notasAluno[i] < 0)) {
				notasAluno[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe uma nota válida!"
						+ "\n" + (i + 1) + "ª nota:"));
			}
			mediaNotas += notasAluno[i];
		}

		mediaNotas = mediaNotas / 4;

		if (mediaNotas >= 9.0) {
			conceito = 'A';
			// Porque usamos aspa simples?
		} else if ((mediaNotas >= 8.0) && (mediaNotas <= 8.9)) {
			conceito = 'B';
		} else if ((mediaNotas >= 7.0) && (mediaNotas <= 7.9)) {
			conceito = 'C';
		} else if (mediaNotas < 7.0) {
			conceito = 'D';
		}

		JOptionPane.showMessageDialog(null, "Conceito " + conceito + " ."
				+ "\n"
				+ "\nMédia: " + df.format(mediaNotas), "Fim", JOptionPane.INFORMATION_MESSAGE);

	}

}
