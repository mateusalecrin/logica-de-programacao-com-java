import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Exercicio8 {

	public static void main(String[] args) {

		// Faça um programa que carregue os valores das vendas de uma loja no primeiro
		// semestre do ano. Considere para tal uma matriz [6,4]
		// sendo que são 06 meses e 04 semanas por mês. Ao final, mostre na tela:
		// ? Total de vendas do semestre
		// ? Total vendido em cada mês

		double[][] vendasSemana = new double[6][4];
		double[] totalMes = new double[6];
		double totalSemestre = 0;
		DecimalFormat df = new DecimalFormat("0.00");

		for (int l = 0; l < 6; l++) {
			for (int c = 0; c < 4; c++) {
				vendasSemana[l][c] = Double.parseDouble(
						JOptionPane.showInputDialog("Vendas na " + (c + 1) + "ª semana do " + (l + 1) + "º mês:"));

				// Verificação
				while (vendasSemana[l][c] < 0) {
					JOptionPane.showMessageDialog(null, "O campo de vendas não aceita números negativos!");
					vendasSemana[l][c] = Double.parseDouble(
							JOptionPane.showInputDialog("Vendas na " + (c + 1) + "ª semana do " + (l + 1) + "º mês:"));
				}

				totalMes[l] += vendasSemana[l][c];
			}

			totalSemestre += totalMes[l];
		}

		if (totalSemestre != 0) {
			for (int l = 0; l < 6; l++) {
				JOptionPane.showMessageDialog(null, "Total de vendas do " + (l + 1) + "º mês:"
						+ "\nR$" + df.format(totalMes[l]));
			}
			if (totalSemestre < 0) {
				JOptionPane.showMessageDialog(null, "A empresa teve prejuízos."
						+ "\nResultado: R$" + df.format(totalSemestre));
			} else {
				JOptionPane.showMessageDialog(null, "A empresa teve lucros."
						+ "\nResultado: R$" + df.format(totalSemestre));
			}
		} else {
			JOptionPane.showMessageDialog(null,
					"A empresa não teve lucros nem prejuízos."
							+ "\nResultado: R$" + df.format(totalSemestre));
		}
	}
}

// Como fazer um concatenação em que mostre os valores como abaixo? Sem ser após
// a virgula.
// 1º Mes :
// 2º Mes :
// 3º Mes :
// 4º Mes :
// 5º Mes :
// 6º Mes :