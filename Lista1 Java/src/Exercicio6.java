import javax.swing.JOptionPane;

public class Exercicio6 {

	public static void main(String[] args) {

		// Crie uma calculadora que permita o cálculo de uma equação, sem limite de
		// execuções definido, da seguinte maneira:
		// 1. Peça o primeiro valor ,
		// 2. Peça o cálculo que deseja fazer (entre as 4 operações básicas),
		// 3. Peça um segundo valor
		// 4. Efetue o cálculo,
		// 5. Peça se o usuário quer continuar calculando. Se ele responder que sim,
		// volte para o passo 2 usando o resultado do cálculo da linha 4 como primeiro
		// valor, e se disser que não, mostre o resultado final .
		// Exemplo de uso para o algoritmo: 4 + 3 = 7 x 4 = 28 / 14 = 2.

		int segundoValor;
		double resultadoValor;
		String operadorAri;
		String repetirOp;
		String aux = "";
		// Como faço pra usar char? Diz que tenho que converter de string pra char

		JOptionPane.showMessageDialog(null, "Olá usuário!", "Início", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Para fins de teste, informe os campos a seguir.", "Informações",
				JOptionPane.INFORMATION_MESSAGE);

		resultadoValor = Integer.parseInt(JOptionPane.showInputDialog("Infome o primeiro valor:"));

		do {
			operadorAri = (JOptionPane.showInputDialog("Qual cálculo você deseja fazer?"
					+ "\n  Informe somente o símbolo do operador." + "\n" + "\n (-) - Subtração" + "\n (+) - Adição"
					+ "\n (*) - Multiplicação" + "\n (/) - Divisão"));

			while ((operadorAri.equals("*") == false) && (operadorAri.equals("/") == false)
					&& (operadorAri.equals("-") == false) && (operadorAri.equals("+") == false)) {
				operadorAri = (JOptionPane.showInputDialog("Informe corretamente!" + "\n (-) - Subtração"
						+ "\n (+) - Adição" + "\n (*) - Multiplicação" + "\n (/) - Divisão"));
			}

			aux = "Infome o segundo valor:";
			do {
				segundoValor = Integer.parseInt(JOptionPane.showInputDialog("Infome o segundo valor:"));
				aux = "Divisão não ocorre quando o segundo valor é ZERO";
			} while ((segundoValor == 0) && (operadorAri.equals("/")));

			switch (operadorAri) {
				case "-":
					resultadoValor = resultadoValor - segundoValor;
					break;

				case "+":
					resultadoValor = resultadoValor + segundoValor;
					break;

				case "*":
					resultadoValor = resultadoValor * segundoValor;
					break;

				case "/":
					resultadoValor = resultadoValor / segundoValor;
					break;
			}

			JOptionPane.showMessageDialog(null, "Resultado: " + resultadoValor, "Fim", JOptionPane.INFORMATION_MESSAGE);

			repetirOp = JOptionPane.showInputDialog("Deseja continuar o cálculo?"
					+ "\n Informe (S) ou (s) para continuar e qualquer outro caractere de texto para encerrar.");
		} while (repetirOp.equals("S") || repetirOp.equals("s"));
	}

}
