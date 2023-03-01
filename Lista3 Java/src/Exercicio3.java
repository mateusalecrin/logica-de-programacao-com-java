import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		double recebaCompra = 0;

		/*
		 * Fa�a um programa que a partir do valor de uma compra, fa�a o c�lculo de um
		 * desconto para o usu�rio. O programa deve solicitar o valor total da compra
		 * por meio de um m�todo, que dever� retorn�-lo. Um m�todo deve ser criado para
		 * receber o valor da compra e mostrar o valor final com desconto, considerando:
		 * 
		 * At� R$100 - sem desconto, o valor permanece o mesmo; De R$100,01 a R$200 -
		 * desconto de 20%; Acima de R$200 - desconto de 30%.
		 */
		JOptionPane.showMessageDialog(null, "Ol� usu�rio!");
		recebaCompra = solicitaValorCompra();
		calculaDesconto(recebaCompra);

	}

	public static double solicitaValorCompra() {
		double recebaCompra = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor da compra?"));

		return recebaCompra;
	}

	public static void calculaDesconto(double recebaCompra) {
		double valorFinalCompra = 0;
		int valorDesconto = 0;

		if (recebaCompra <= 100) {
			valorFinalCompra = recebaCompra;
		} else if (recebaCompra <= 200) {
			valorDesconto = 20;
			valorFinalCompra = recebaCompra - ((recebaCompra * valorDesconto) / 100);
		} else {
			valorDesconto = 30;
			valorFinalCompra = recebaCompra - ((recebaCompra * valorDesconto) / 100);
		}
		JOptionPane.showMessageDialog(null,
				"Desconto de " + valorDesconto + "%.\nValor final da compra: R$" + valorFinalCompra);
		return;
	}
}
