import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {

		// Variáveis que irão receber horas, minutos e segundos.
		int varHoras;
		int varMinutos;
		int varSegundos;
		// Início do sistema, informações aos usuários.
		JOptionPane.showMessageDialog(null, " Olá usuário!", "Início", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null,
				"Insira nos campos seguintes as horas, minutos e segundos para fins de teste.", "Informações",
				JOptionPane.INFORMATION_MESSAGE);
		// Entrada de dados (Por padrão o showInputDiaLog recebe os dados como string,
		// usamos Integer.parseInt para convertê-lo em números inteiros).
		JOptionPane.showMessageDialog(null, "Somente números inteiros e positivos!", "Aviso!",
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

		// Cálculos
		varHoras = ((varHoras * 60) * 60);
		varMinutos = (varMinutos * 60);
		varSegundos = (varHoras + varMinutos + varSegundos);
		// Saída de dados
		JOptionPane.showMessageDialog(null, "Total de segundos: " + varSegundos, "Fim",
				JOptionPane.INFORMATION_MESSAGE);
	}

}
