import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * Voc� dever� desenvolver os 03 exerc�cios que seguem, respeitando os m�todos
		 * solicitados em cada um. Analise se o m�todo precisa receber par�metros e se
		 * precisa de retorno ou n�o (nos casos onde isso n�o � expl�cito).
		 * 
		 * 1. Fa�a um programa que solicite o ano de nascimento de um usu�rio e seja
		 * mostrada a sua idade em 2021. N�o � necess�rio considerar se o usu�rio j� fez
		 * ou n�o anivers�rio. Um m�todo deve ser criado para solicitar o ano de
		 * nascimento ao usu�rio e retorn�-lo, e outro m�todo deve ser criado para
		 * receber o ano de nascimento, calcular a idade atual e mostr�-la.
		 * 
		 */
		JOptionPane.showMessageDialog(null, "Ol� Usu�rio!");
		int anoNascimento = solicitaAnodeNascimento();
		calculaeMostraIdade(anoNascimento);
	}

	public static int solicitaAnodeNascimento() {
		int anoNascimento = Integer.parseInt(
				JOptionPane.showInputDialog("Qual o seu ano de nascimento? \n(Escreva os 4 d�gitos corretamente)"));
		return anoNascimento;
	}

	public static void calculaeMostraIdade(int anoNascimento) {

		int idadeUsuario = 2021 - anoNascimento;
		JOptionPane.showMessageDialog(null, "Voc� tem " + idadeUsuario + " anos.");
		return;
	}
}
