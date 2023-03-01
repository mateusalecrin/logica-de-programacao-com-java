import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Exercicio8 {

	public static void main(String[] args) {

		// Fa�a um programa que carregue os valores das vendas de uma loja no primeiro
		// semestre do ano. Considere para tal uma matriz [6,4]
		// sendo que s�o 06 meses e 04 semanas por m�s. Ao final, mostre na tela:
		// ? Total de vendas do semestre
		// ? Total vendido em cada m�s

		double[][] vendasSemana = new double[6][4];
		double[] totalMes = new double[6];
		double totalSemestre = 0;
		DecimalFormat df = new DecimalFormat("0.00");

		for (int l = 0; l < 6; l++) {
			for (int c = 0; c < 4; c++) {
				vendasSemana[l][c] = Double.parseDouble(
						JOptionPane.showInputDialog("Vendas na " + (c + 1) + "� semana do " + (l + 1) + "� m�s:"));

				// Verifica��o
				while (vendasSemana[l][c] < 0) {
					JOptionPane.showMessageDialog(null, "O campo de vendas n�o aceita n�meros negativos!");
					vendasSemana[l][c] = Double.parseDouble(
							JOptionPane.showInputDialog("Vendas na " + (c + 1) + "� semana do " + (l + 1) + "� m�s:"));
				}

				totalMes[l] += vendasSemana[l][c];
			}

			totalSemestre += totalMes[l];
		}

		if (totalSemestre != 0) {
			for (int l = 0; l < 6; l++) {
				JOptionPane.showMessageDialog(null, "Total de vendas do " + (l + 1) + "� m�s:"
						+ "\nR$" + df.format(totalMes[l]));
			}
			if (totalSemestre < 0) {
				JOptionPane.showMessageDialog(null, "A empresa teve preju�zos."
						+ "\nResultado: R$" + df.format(totalSemestre));
			} else {
				JOptionPane.showMessageDialog(null, "A empresa teve lucros."
						+ "\nResultado: R$" + df.format(totalSemestre));
			}
		} else {
			JOptionPane.showMessageDialog(null,
					"A empresa n�o teve lucros nem preju�zos."
							+ "\nResultado: R$" + df.format(totalSemestre));
		}
	}
}

// Como fazer um concatena��o em que mostre os valores como abaixo? Sem ser ap�s
// a virgula.
// 1� Mes :
// 2� Mes :
// 3� Mes :
// 4� Mes :
// 5� Mes :
// 6� Mes :