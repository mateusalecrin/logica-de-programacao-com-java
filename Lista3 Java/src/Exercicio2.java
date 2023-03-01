import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		double[] recebaNotasAluno = new double[3];
		double calculaMedia = 0;
		int recebaMediaDesejada = 0;
		int[] pesosMediaPonderada = new int[3];
		int i = 0;
		/*
		 * Faça um programa que receba as três notas de um aluno e pergunte ao professor
		 * qual média ele deseja calcular: aritmética ou ponderada. Se for a média
		 * ponderada, os pesos de cada nota devem ser informados.
		 * 
		 * Cada média deverá ser calculada por um método;
		 * 
		 * Os dois métodos devem receber como parâmetros as notas;
		 * 
		 * No caso do método da média ponderada, além das notas, o método deverá receber
		 * também os pesos, que devem ser previamente solicitados ao usuário;
		 * 
		 * Os dois métodos devem retornar a média;
		 * 
		 * Um método deve ser criado para receber a média final e mostrar se o aluno
		 * está aprovado ou reprovado, considerando que a média mínima para aprovação é
		 * 7.
		 * 
		 */

		JOptionPane.showMessageDialog(null,
				"Olá usuário!"
						+ "\nAluno você informará as notas para que o professor escolha a média a ser calculada.");

		for (i = 0; i < 3; i++) {
			recebaNotasAluno[i] = Double.parseDouble(JOptionPane.showInputDialog("A " + (i + 1) + "ª nota:"));
			while (recebaNotasAluno[i] < 0 || recebaNotasAluno[i] > 10) {
				mostraErroNota();
				recebaNotasAluno[i] = Double
						.parseDouble(JOptionPane.showInputDialog("A " + (i + 1) + "ª 0000000000nota:"));
			}
		}

		recebaMediaDesejada = Integer.parseInt(JOptionPane.showInputDialog(
				"Professor, qual média a ser calculada? " + "\n(1)Aritmética Simples" + "\n(2)Ponderada"));
		while (recebaMediaDesejada < 1 || recebaMediaDesejada > 2) {
			mostraErroEscolhaMedia();
			recebaMediaDesejada = Integer.parseInt(JOptionPane.showInputDialog(
					"Professor, qual média a ser calculada? " + "\n(1)Aritmética Simples" + "\n(2)Ponderada"));
		}
		double mediaNotas;
		if (recebaMediaDesejada == 2) {
			for (i = 0; i < 3; i++) {
				pesosMediaPonderada[i] = Integer
						.parseInt(JOptionPane.showInputDialog((i + 1) + "ª prova: " + recebaNotasAluno[i]
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
			JOptionPane.showMessageDialog(null, "Você está aprovado! \nMédia: " + mediaNotas);
		} else {
			JOptionPane.showMessageDialog(null, "Você está reprovado! \nMédia: " + mediaNotas);
		}
	}

	public static void mostraErroNota() {
		JOptionPane.showMessageDialog(null, "A nota digitada é inválida!");
	}

	public static void mostraErroEscolhaMedia() {
		JOptionPane.showMessageDialog(null, "Você informou incorretamente o número correspondente a opção da média!");
	}
}
