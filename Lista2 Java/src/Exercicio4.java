import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Exercicio4 {

	public static void main(String[] args) {
		// Sabe-se que o latão é constituído de 70% de cobre e 30% de zinco.
		// Faça um programa que permita ao usuário informar uma quantidade de latão em
		// quilos e forneça o total de cobre e zinco necessários para fabricar essa
		// quantidade.
		double qtdeLatao, qtdeCobre, qtdeZinco;
		DecimalFormat df = new DecimalFormat("0.000");

		JOptionPane.showMessageDialog(null, "Olá usuário!", "Início", JOptionPane.INFORMATION_MESSAGE);
		qtdeLatao = Double.parseDouble(JOptionPane.showInputDialog("Qual a quantidade de latão? (EM KG)"));

		while (qtdeLatao <= 0) {
			qtdeLatao = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor positivo!"
					+ "\nQual a quantidade de latão? (EM KG)"));

		}

		qtdeCobre = qtdeLatao * 0.7;
		qtdeZinco = qtdeLatao * 0.3;

		JOptionPane.showMessageDialog(null, "Para fabricar " + qtdeLatao + " kgs de latão será necessário:"
				+ "\n" + df.format(qtdeCobre) + " kgs de cobre;"
				+ "\n" + df.format(qtdeZinco) + " kgs de zinco.");
	}

}
