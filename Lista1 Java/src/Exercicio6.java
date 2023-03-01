import javax.swing.JOptionPane;

public class Exercicio6 {

	public static void main(String[] args) {

		// Crie uma calculadora que permita o c�lculo de uma equa��o, sem limite de
		// execu��es definido, da seguinte maneira:
		// 1. Pe�a o primeiro valor ,
		// 2. Pe�a o c�lculo que deseja fazer (entre as 4 opera��es b�sicas),
		// 3. Pe�a um segundo valor
		// 4. Efetue o c�lculo,
		// 5. Pe�a se o usu�rio quer continuar calculando. Se ele responder que sim,
		// volte para o passo 2 usando o resultado do c�lculo da linha 4 como primeiro
		// valor, e se disser que n�o, mostre o resultado final .
		// Exemplo de uso para o algoritmo: 4 + 3 = 7 x 4 = 28 / 14 = 2.

		int segundoValor;
		double resultadoValor;
		String operadorAri;
		String repetirOp;
		String aux = "";
		// Como fa�o pra usar char? Diz que tenho que converter de string pra char

		JOptionPane.showMessageDialog(null, "Ol� usu�rio!", "In�cio", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Para fins de teste, informe os campos a seguir.", "Informa��es",
				JOptionPane.INFORMATION_MESSAGE);

		resultadoValor = Integer.parseInt(JOptionPane.showInputDialog("Infome o primeiro valor:"));

		do {
			operadorAri = (JOptionPane.showInputDialog("Qual c�lculo voc� deseja fazer?"
					+ "\n  Informe somente o s�mbolo do operador." + "\n" + "\n (-) - Subtra��o" + "\n (+) - Adi��o"
					+ "\n (*) - Multiplica��o" + "\n (/) - Divis�o"));

			while ((operadorAri.equals("*") == false) && (operadorAri.equals("/") == false)
					&& (operadorAri.equals("-") == false) && (operadorAri.equals("+") == false)) {
				operadorAri = (JOptionPane.showInputDialog("Informe corretamente!" + "\n (-) - Subtra��o"
						+ "\n (+) - Adi��o" + "\n (*) - Multiplica��o" + "\n (/) - Divis�o"));
			}

			aux = "Infome o segundo valor:";
			do {
				segundoValor = Integer.parseInt(JOptionPane.showInputDialog("Infome o segundo valor:"));
				aux = "Divis�o n�o ocorre quando o segundo valor � ZERO";
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

			repetirOp = JOptionPane.showInputDialog("Deseja continuar o c�lculo?"
					+ "\n Informe (S) ou (s) para continuar e qualquer outro caractere de texto para encerrar.");
		} while (repetirOp.equals("S") || repetirOp.equals("s"));
	}

}
