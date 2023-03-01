import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Exercicio5 {

	public static void main(String[] args) {

		// Faça um programa que solicite alguns dados dos usuários que frequentam um
		// clube.
		// O programa deve solicitar a idade, se a pessoa é fumante ou não (1- SIM, 2-
		// NÃO), seu salário líquido e há quanto tempo frequenta o clube (em meses).
		// O usuário deverá digitar “encerrar” quando não tiver mais pessoas para
		// registrar. Como dados de saída, o programa deve exibir:
		// A média das idades das pessoas;
		// A média salarial das pessoas;
		// Quantos são fumantes e quantos não são fumantes;
		// A porcentagem de pessoas que frequentam o clube há mais de 03 meses.

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

		JOptionPane.showMessageDialog(null, "Olá cliente do \nCORLEONE \nGolf \nPark ! " + "\n"
				+ "\nPara fins avaliativos, forneça alguns dados a seguir.");

		do {
			quantidadeUsu += 1;

			do {
				idadeUsu = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade?"));
			} while (idadeUsu <= 0);
			idadeUsuMedia += idadeUsu;

			do {
				salariolqdUsu = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu salário líquido?"));
			} while (salariolqdUsu < 0);
			salariolqdUsuMedia += salariolqdUsu;

			do {
				fumanteUsu = Integer.parseInt(JOptionPane.showInputDialog("Fumante? \n(1) - SIM \n(2) - NÃO"));
			} while ((fumanteUsu != 1) && (fumanteUsu != 2));

			if (fumanteUsu == 1) {
				simFumante += 1;
			} else {
				naoFumante += 1;
			}

			do {
				tempoUsu = Integer
						.parseInt(JOptionPane.showInputDialog("Há quanto tempo frequenta o clube? (EM MESES)"));
			} while (tempoUsu < 0);

			if (tempoUsu > 3) {
				fielUsu += 1;
			}

			do {
				respostaUsu = JOptionPane.showInputDialog(null, "Há mais alguém para informar?\nSIM ou ENCERRAR");
			} while ((respostaUsu.equalsIgnoreCase("Sim") == false)
					&& (respostaUsu.equalsIgnoreCase("Encerrar") == false));

		} while (respostaUsu.equalsIgnoreCase("Encerrar") == false);

		idadeUsuMedia = (idadeUsuMedia / quantidadeUsu);
		salariolqdUsuMedia = (salariolqdUsuMedia / quantidadeUsu);
		porcentagemUsu = ((fielUsu * 100) / quantidadeUsu);
		JOptionPane.showMessageDialog(null,
				"Média das idades: " + (idadeUsuMedia) + "; \nMédia salarial: R$" + df.format(salariolqdUsuMedia)
						+ "; \nQuantidade de fumantes: " + simFumante + "; \nQuantidade de não fumantes: " + naoFumante
						+ "; \nMembros que frequentam o clube há mais de 3 meses: " + df.format(porcentagemUsu) + "%.");
	}
}
