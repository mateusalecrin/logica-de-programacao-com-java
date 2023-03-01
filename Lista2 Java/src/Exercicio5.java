import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Exercicio5 {

	public static void main(String[] args) {

		// Fa�a um programa que solicite alguns dados dos usu�rios que frequentam um
		// clube.
		// O programa deve solicitar a idade, se a pessoa � fumante ou n�o (1- SIM, 2-
		// N�O), seu sal�rio l�quido e h� quanto tempo frequenta o clube (em meses).
		// O usu�rio dever� digitar �encerrar� quando n�o tiver mais pessoas para
		// registrar. Como dados de sa�da, o programa deve exibir:
		// A m�dia das idades das pessoas;
		// A m�dia salarial das pessoas;
		// Quantos s�o fumantes e quantos n�o s�o fumantes;
		// A porcentagem de pessoas que frequentam o clube h� mais de 03 meses.

		int quantidadeUsu = 0;
		int fumanteUsu = 0;
		int simFumante = 0;
		int naoFumante = 0;
		int idadeUsu = 0;
		int idadeUsuMedia = 0;
		int tempoUsu = 0;
		int fielUsu = 0;
		double porcentagemUsu = 0;
		double salariolqdUsu = 0;
		double salariolqdUsuMedia = 0;
		String respostaUsu = "";
		DecimalFormat df = new DecimalFormat("0.00");

		JOptionPane.showMessageDialog(null, "Ol� cliente do \nCORLEONE \nGolf \nPark ! " + "\n"
				+ "\nPara fins avaliativos, forne�a alguns dados a seguir.");

		do {
			quantidadeUsu += 1;

			do {
				idadeUsu = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade?"));
			} while (idadeUsu <= 0);
			idadeUsuMedia += idadeUsu;

			do {
				salariolqdUsu = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu sal�rio l�quido?"));
			} while (salariolqdUsu < 0);
			salariolqdUsuMedia += salariolqdUsu;

			do {
				fumanteUsu = Integer.parseInt(JOptionPane.showInputDialog("Fumante? \n(1) - SIM \n(2) - N�O"));
			} while ((fumanteUsu != 1) && (fumanteUsu != 2));

			if (fumanteUsu == 1) {
				simFumante += 1;
			} else {
				naoFumante += 1;
			}

			do {
				tempoUsu = Integer
						.parseInt(JOptionPane.showInputDialog("H� quanto tempo frequenta o clube? (EM MESES)"));
			} while (tempoUsu < 0);

			if (tempoUsu > 3) {
				fielUsu += 1;
			}

			do {
				respostaUsu = JOptionPane.showInputDialog(null, "H� mais algu�m para informar?\nSIM ou ENCERRAR");
			} while ((respostaUsu.equalsIgnoreCase("Sim") == false)
					&& (respostaUsu.equalsIgnoreCase("Encerrar") == false));

		} while (respostaUsu.equalsIgnoreCase("Encerrar") == false);

		idadeUsuMedia = (idadeUsuMedia / quantidadeUsu);
		salariolqdUsuMedia = (salariolqdUsuMedia / quantidadeUsu);
		porcentagemUsu = ((fielUsu * 100) / quantidadeUsu);
		JOptionPane.showMessageDialog(null,
				"M�dia das idades: " + (idadeUsuMedia) + "; \nM�dia salarial: R$" + df.format(salariolqdUsuMedia)
						+ "; \nQuantidade de fumantes: " + simFumante + "; \nQuantidade de n�o fumantes: " + naoFumante
						+ "; \nMembros que frequentam o clube h� mais de 3 meses: " + df.format(porcentagemUsu) + "%.");
	}
}
