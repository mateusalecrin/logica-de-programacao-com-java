import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * Você deverá desenvolver os 03 exercícios que seguem, respeitando os métodos
		 * solicitados em cada um. Analise se o método precisa receber parâmetros e se
		 * precisa de retorno ou não (nos casos onde isso não é explícito).
		 * 
		 * 1. Faça um programa que solicite o ano de nascimento de um usuário e seja
		 * mostrada a sua idade em 2021. Não é necessário considerar se o usuário já fez
		 * ou não aniversário. Um método deve ser criado para solicitar o ano de
		 * nascimento ao usuário e retorná-lo, e outro método deve ser criado para
		 * receber o ano de nascimento, calcular a idade atual e mostrá-la.
		 * 
		 */
		JOptionPane.showMessageDialog(null, "Olá Usuário!");
		int anoNascimento = solicitaAnodeNascimento();
		calculaeMostraIdade(anoNascimento);
	}

	public static int solicitaAnodeNascimento() {
		int anoNascimento = Integer.parseInt(
				JOptionPane.showInputDialog("Qual o seu ano de nascimento? \n(Escreva os 4 dígitos corretamente)"));
		return anoNascimento;
	}

	public static void calculaeMostraIdade(int anoNascimento) {

		int idadeUsuario = 2021 - anoNascimento;
		JOptionPane.showMessageDialog(null, "Você tem " + idadeUsuario + " anos.");
		return;
	}
}
