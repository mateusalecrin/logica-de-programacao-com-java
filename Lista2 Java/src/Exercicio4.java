import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Exercicio4 {

	public static void main(String[] args) {
		// Sabe-se que o lat�o � constitu�do de 70% de cobre e 30% de zinco.
		// Fa�a um programa que permita ao usu�rio informar uma quantidade de lat�o em
		// quilos e forne�a o total de cobre e zinco necess�rios para fabricar essa
		// quantidade.
		double qtdeLatao, qtdeCobre, qtdeZinco;
		DecimalFormat df = new DecimalFormat("0.000");

		JOptionPane.showMessageDialog(null, "Ol� usu�rio!", "In�cio", JOptionPane.INFORMATION_MESSAGE);
		qtdeLatao = Double.parseDouble(JOptionPane.showInputDialog("Qual a quantidade de lat�o? (EM KG)"));

		while (qtdeLatao <= 0) {
			qtdeLatao = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor positivo!"
					+ "\nQual a quantidade de lat�o? (EM KG)"));

		}

		qtdeCobre = qtdeLatao * 0.7;
		qtdeZinco = qtdeLatao * 0.3;

		JOptionPane.showMessageDialog(null, "Para fabricar " + qtdeLatao + " kgs de lat�o ser� necess�rio:"
				+ "\n" + df.format(qtdeCobre) + " kgs de cobre;"
				+ "\n" + df.format(qtdeZinco) + " kgs de zinco.");
	}

}
