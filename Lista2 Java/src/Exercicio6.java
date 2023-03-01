import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Exercicio6 {

	public static void main(String[] args) {

		// 6) Uma empresa deseja saber alguns dados sobre suas vendas no passado.
		// Faça um programa que armazene em um vetor o valor total das vendas de cada um
		// dos 12 meses do ano (que deverá ser informado pelo usuário) e mostre:
		// O mês com a maior venda;
		// O mês com a menor venda;
		// A média das vendas do ano todo;
		// A média das vendas dos meses pares;
		// A média das vendas do 2º semestre.

		String msgMaior = "";
		String msgMenor = "";
		String[] mesesAno = new String[12];
		DecimalFormat df = new DecimalFormat("0.00");
		double maiorVenda = 0;
		double menorVenda = 0;
		double mediaAno = 0;
		double media2Sem = 0;
		double mediamesesPares = 0;
		double[] vendasMensais = new double[12];
		int qtdmesesPares = 0;

		mesesAno[0] = "Janeiro";
		mesesAno[1] = "Fevereiro";
		mesesAno[2] = "Março";
		mesesAno[3] = "Abril";
		mesesAno[4] = "Maio";
		mesesAno[5] = "Junho";
		mesesAno[6] = "Julho";
		mesesAno[7] = "Agosto";
		mesesAno[8] = "Setembro";
		mesesAno[9] = "Outubro";
		mesesAno[10] = "Novembro";
		mesesAno[11] = "Dezembro";

		JOptionPane.showMessageDialog(null, "Bem vindo ao sistema financeiro.");

		for (int i = 0; i < 12; i++) {
			do {
				vendasMensais[i] = Double.parseDouble(JOptionPane.showInputDialog("Vendas de " + mesesAno[i] + ":"));
			} while (vendasMensais[i] < 0);
			mediaAno += vendasMensais[i];
			int restoI = ((i + 1) % 2);

			if (i > 5) {
				media2Sem += vendasMensais[i];
			} else if (i == 0) {
				menorVenda = vendasMensais[i];
				msgMenor = mesesAno[i] + " é o mês com menor venda: R$" + menorVenda;
			} else if ((i != 0) && (vendasMensais[i] < menorVenda)) {
				menorVenda = vendasMensais[i];
				msgMenor = mesesAno[i] + " é o mês com menor venda: R$" + menorVenda;
			} else if (vendasMensais[i] > maiorVenda) {
				maiorVenda = vendasMensais[i];
				msgMaior = mesesAno[i] + " é o mês com maior venda: R$" + maiorVenda;
			} else if (restoI == 0) {
				qtdmesesPares += 1;
				mediamesesPares += vendasMensais[i];
			}
		}
		mediaAno = (mediaAno / 12);
		mediamesesPares = (mediamesesPares / qtdmesesPares);
		media2Sem = (media2Sem / 6);
		JOptionPane.showMessageDialog(null,
				msgMaior + "\n" + msgMenor + "\nMédia das vendas do ano todo: R$" + df.format(mediaAno)
						+ "\nMédia das vendas dos meses pares: R$" + df.format(mediamesesPares)
						+ "\nMédia das vendas do segundo semestre: R$" + df.format(media2Sem));
	}
}
