import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Exercicio7 {

	public static void main(String[] args) {
		/*
		 * Um estudante do ensino médio gostaria de controlar melhor suas notas nas
		 * disciplinas exatas. Ele gostaria de poder enxergar suas notas dos 4 bimestres
		 * com exatamente duas casas decimais e em formato de matriz, como no exemplo a
		 * seguir:
		 * 
		 * Matemática Física Química 9.53 8.66 8.45 7.57 9.00 8.01 8.87 9.44 7.88 7.30
		 * 6.77 9.21
		 * 
		 * Além disso, o estudante gostaria de poder escolher algumas opções de
		 * visualização de acordo com o menu abaixo:
		 * 
		 * Todas as notas de todas as disciplinas; Qual a maior nota e em qual
		 * disciplina foi; A média das notas de alguma disciplina (solicitar qual); As
		 * notas de um dos bimestres (solicitar qual); Encerrar.
		 * 
		 * Faça um programa que permita cadastrar as notas de acordo com o exemplo
		 * (considerando a ordem das disciplinas) e forneça os dados supracitados. O
		 * menu deve ser exibido repetitivamente, até que o usuário deseje encerrar o
		 * programa.
		 */
		int linhas = 0;
		int colunas = 0;
		int menuUsu = 0;
		int posicaoNota = 0;
		double[] mediaNota = new double[3];
		double maiorNota = 0;
		double[][] tabelaUsu = new double[4][3];
		String[] materiaUsu = new String[3];
		boolean finalizaMenu = false;
		DecimalFormat df = new DecimalFormat("0.00");
		materiaUsu[0] = "Matemática";
		materiaUsu[1] = "Física";
		materiaUsu[2] = "Química";

		for (linhas = 0; linhas < 4; linhas++) {
			JOptionPane.showMessageDialog(null, (linhas + 1) + "º Bimestre.");
			for (colunas = 0; colunas < 3; colunas++) {

				do {
					tabelaUsu[linhas][colunas] = Double
							.parseDouble(JOptionPane.showInputDialog(materiaUsu[colunas] + "\nNota:"));
				} while ((tabelaUsu[linhas][colunas] < 0) || (tabelaUsu[linhas][colunas] > 10));

				if (tabelaUsu[linhas][colunas] > maiorNota) {
					maiorNota = tabelaUsu[linhas][colunas];
					posicaoNota = colunas;
				}
				switch (colunas) {
					case 0:
						mediaNota[0] += tabelaUsu[linhas][colunas];
						break;
					case 1:
						mediaNota[1] += tabelaUsu[linhas][colunas];
						break;
					case 2:
						mediaNota[2] += tabelaUsu[linhas][colunas];
						break;
				}

			}
		}
		mediaNota[0] /= 4;
		mediaNota[1] /= 4;
		mediaNota[2] /= 4;

		do {
			menuUsu = Integer.parseInt(JOptionPane.showInputDialog("MENU \n(1) Todas as notas de todas as disciplinas;"
					+ "\n(2) Qual a maior nota e em qual disciplina;" + "\n(3) A média das notas de alguma disciplina;"
					+ "\n(4) As notas de um dos bimestres;" + "\n(5) Encerrar."));

			switch (menuUsu) {
				case 1:
					JOptionPane.showMessageDialog(null,
							materiaUsu[0] + "   " + materiaUsu[1] + "   " + materiaUsu[2] + "\n        "
									+ tabelaUsu[0][0]
									+ "          " + tabelaUsu[0][1] + "         " + tabelaUsu[0][2] + "\n        "
									+ tabelaUsu[1][0] + "          " + tabelaUsu[1][1] + "         " + tabelaUsu[1][2]
									+ "\n        " + tabelaUsu[2][0] + "          " + tabelaUsu[2][1] + "         "
									+ tabelaUsu[2][2] + "\n        " + tabelaUsu[3][0] + "          " + tabelaUsu[3][1]
									+ "         " + tabelaUsu[3][2]);
					break;
				case 2:
					JOptionPane.showMessageDialog(null,
							"Maior nota: " + maiorNota + "\nMatéria: " + materiaUsu[posicaoNota]);
					break;
				case 3:
					do {
						colunas = Integer.parseInt(
								JOptionPane.showInputDialog(null,
										"Disciplina: \n(1) Matemática (2) Física (3) Química"));
					} while ((colunas < 1) || (colunas > 3));
					colunas -= 1;
					JOptionPane.showMessageDialog(null,
							"Disciplina: " + materiaUsu[colunas] + "\nMédia: " + df.format(mediaNota[colunas]));
					break;
				case 4:
					do {
						colunas = Integer.parseInt(JOptionPane.showInputDialog("Qual bimestre? (1º, 2º, 3º, ou 4º)."));
					} while ((colunas < 1) || (colunas > 4));
					colunas -= 1;
					JOptionPane.showMessageDialog(null,
							materiaUsu[0] + "   " + materiaUsu[1] + "   " + materiaUsu[2] + "\n        "
									+ tabelaUsu[colunas][0] + "          " + tabelaUsu[colunas][1] + "         "
									+ tabelaUsu[colunas][2]);
					break;
				case 5:
					finalizaMenu = true;
					break;
				default:
					JOptionPane.showMessageDialog(null, "Errado. Informe novamente!");
					break;
			}
		} while ((finalizaMenu == false));
	}

}
