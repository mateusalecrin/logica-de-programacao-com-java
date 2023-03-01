import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		double[] recebaNotasAluno = new double[3];
		double calculaMedia = 0;
		int recebaMediaDesejada = 0;
		int[] pesosMediaPonderada = new int[3];
		int i = 0;
		/*
		 * Fa�a um programa que receba as tr�s notas de um aluno e pergunte ao professor
		 * qual m�dia ele deseja calcular: aritm�tica ou ponderada. Se for a m�dia
		 * ponderada, os pesos de cada nota devem ser informados.
		 * 
		 * Cada m�dia dever� ser calculada por um m�todo;
		 * 
		 * Os dois m�todos devem receber como par�metros as notas;
		 * 
		 * No caso do m�todo da m�dia ponderada, al�m das notas, o m�todo dever� receber
		 * tamb�m os pesos, que devem ser previamente solicitados ao usu�rio;
		 * 
		 * Os dois m�todos devem retornar a m�dia;
		 * 
		 * Um m�todo deve ser criado para receber a m�dia final e mostrar se o aluno
		 * est� aprovado ou reprovado, considerando que a m�dia m�nima para aprova��o �
		 * 7.
		 * 
		 */

		JOptionPane.showMessageDialog(null,
				"Ol� usu�rio!"
						+ "\nAluno voc� informar� as notas para que o professor escolha a m�dia a ser calculada.");

		for (i = 0; i < 3; i++) {
			recebaNotasAluno[i] = Double.parseDouble(JOptionPane.showInputDialog("A " + (i + 1) + "� nota:"));
			while (recebaNotasAluno[i] < 0 || recebaNotasAluno[i] > 10) {
				mostraErroNota();
				recebaNotasAluno[i] = Double
						.parseDouble(JOptionPane.showInputDialog("A " + (i + 1) + "� 0000000000nota:"));
			}
		}

		recebaMediaDesejada = Integer.parseInt(JOptionPane.showInputDialog(
				"Professor, qual m�dia a ser calculada? " + "\n(1)Aritm�tica Simples" + "\n(2)Ponderada"));
		while (recebaMediaDesejada < 1 || recebaMediaDesejada > 2) {
			mostraErroEscolhaMedia();
			recebaMediaDesejada = Integer.parseInt(JOptionPane.showInputDialog(
					"Professor, qual m�dia a ser calculada? " + "\n(1)Aritm�tica Simples" + "\n(2)Ponderada"));
		}
		double mediaNotas;
		if (recebaMediaDesejada == 2) {
			for (i = 0; i < 3; i++) {
				pesosMediaPonderada[i] = Integer
						.parseInt(JOptionPane.showInputDialog((i + 1) + "� prova: " + recebaNotasAluno[i]
								+ "\nQual o peso?"));
			}
			mediaNotas = calculaMediaPonderada(calculaMedia, i, recebaNotasAluno, pesosMediaPonderada);
			avaliaNotas(mediaNotas);
		} else {
			mediaNotas = calculaMediaAritmetica(recebaNotasAluno);
			avaliaNotas(mediaNotas);
		}

	}

	public static double calculaMediaAritmetica(double recebaNotasAluno[]) {
		double mediaNotas = ((recebaNotasAluno[0] + recebaNotasAluno[1] + recebaNotasAluno[2]) / 3);
		return mediaNotas;

	}

	public static double calculaMediaPonderada(double calculaMedia, int i, double[] recebaNotasAluno,
			int[] pesosMediaPonderada) {
		for (i = 0; i < 3; i++) {
			calculaMedia += (recebaNotasAluno[i] * pesosMediaPonderada[i]);
		}
		double mediaNotas = calculaMedia / (pesosMediaPonderada[0] + pesosMediaPonderada[1] + pesosMediaPonderada[2]);

		return mediaNotas;
	}

	public static void avaliaNotas(double mediaNotas) {
		if (mediaNotas >= 7) {
			JOptionPane.showMessageDialog(null, "Voc� est� aprovado! \nM�dia: " + mediaNotas);
		} else {
			JOptionPane.showMessageDialog(null, "Voc� est� reprovado! \nM�dia: " + mediaNotas);
		}
	}

	public static void mostraErroNota() {
		JOptionPane.showMessageDialog(null, "A nota digitada � inv�lida!");
	}

	public static void mostraErroEscolhaMedia() {
		JOptionPane.showMessageDialog(null, "Voc� informou incorretamente o n�mero correspondente a op��o da m�dia!");
	}
}
