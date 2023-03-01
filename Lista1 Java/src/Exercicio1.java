import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {

		// Vari�veis que ir�o receber horas, minutos e segundos.
		int varHoras;
		int varMinutos;
		int varSegundos;
		// In�cio do sistema, informa��es aos usu�rios.
		JOptionPane.showMessageDialog(null, " Ol� usu�rio!", "In�cio", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null,
				"Insira nos campos seguintes as horas, minutos e segundos para fins de teste.", "Informa��es",
				JOptionPane.INFORMATION_MESSAGE);
		// Entrada de dados (Por padr�o o showInputDiaLog recebe os dados como string,
		// usamos Integer.parseInt para convert�-lo em n�meros inteiros).
		JOptionPane.showMessageDialog(null, "Somente n�meros inteiros e positivos!", "Aviso!",
				JOptionPane.WARNING_MESSAGE);

		do {
			varHoras = Integer.parseInt(JOptionPane.showInputDialog("Informe as horas:"));
		} while (varHoras < 0);

		do {
			varMinutos = Integer.parseInt(JOptionPane.showInputDialog("Informe os minutos:"));
		} while (varMinutos < 0);

		do {
			varSegundos = Integer.parseInt(JOptionPane.showInputDialog("Informe os segundos:"));
		} while (varSegundos < 0);

		// C�lculos
		varHoras = ((varHoras * 60) * 60);
		varMinutos = (varMinutos * 60);
		varSegundos = (varHoras + varMinutos + varSegundos);
		// Sa�da de dados
		JOptionPane.showMessageDialog(null, "Total de segundos: " + varSegundos, "Fim",
				JOptionPane.INFORMATION_MESSAGE);
	}

}
