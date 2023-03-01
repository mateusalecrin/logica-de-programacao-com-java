import javax.swing.JOptionPane;

public class JogoDaVelha {

	public static void main(String[] args) {

		int linhas = 0;
		int colunas = 0;
		int qtdeJogadas = 0;
		int numerodaJogada = 0;
		String mostraJogo = "";
		String[] nomeJogador = new String[2];
		String[] letraJogador = new String[2];
		String[][] jogodaVelha = new String[3][3];
		boolean jogadorVencedor = false;

		JOptionPane.showMessageDialog(null, "Bem vindo ao jogo da velha.");

		for (linhas = 0; linhas < 3; linhas++) {
			for (colunas = 0; colunas < 3; colunas++) {
				jogodaVelha[linhas][colunas] = " ";
			}
		}

		nomeJogador = solicitaNome();
		letraJogador = solicitaLetra(nomeJogador);

		for (qtdeJogadas = 0; qtdeJogadas < 9; qtdeJogadas++) {
			if (jogadorVencedor == false) {
				jogodaVelha = solicitaJogadas(qtdeJogadas, nomeJogador, letraJogador, jogodaVelha);
				mostraJogo = mostraJogo(jogodaVelha);
				JOptionPane.showMessageDialog(null, mostraJogo);
				jogadorVencedor = verificaJogo(letraJogador, jogodaVelha);
				numerodaJogada = qtdeJogadas;
			}
		}

		if (jogadorVencedor == true) {
			if (numerodaJogada % 2 == 0) {
				JOptionPane.showMessageDialog(null, nomeJogador[0] + " é o vencedor!");
			} else {
				JOptionPane.showMessageDialog(null, nomeJogador[1] + " é o vencedor!");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Empate! (Velha) \n Fim de jogo.");
		}
	}

	public static String[] solicitaNome() {
		String[] nomeJogador = new String[2];
		for (int i = 0; i < 2; i++) {
			nomeJogador[i] = JOptionPane.showInputDialog("Nome do Jogador " + (i + 1) + ":");
		}
		return nomeJogador;
	}

	public static String[] solicitaLetra(String[] nomeJogador) {
		String[] letraJogador = new String[2];

		letraJogador[0] = JOptionPane.showInputDialog(nomeJogador[0] + " X ou O?");

		while ((letraJogador[0].equals("X") == false) && (letraJogador[0].equals("O") == false)) {
			letraJogador[0] = JOptionPane.showInputDialog(" X ou O?");
		}

		if (letraJogador[0].equals("O")) {
			letraJogador[1] = "X";
		} else {
			letraJogador[1] = "O";
		}

		JOptionPane.showMessageDialog(null, nomeJogador[0] + ", você é " + letraJogador[0] + "! \n" + nomeJogador[1]
				+ ", você é " + letraJogador[1] + "!");

		return letraJogador;
	}

	public static String[][] solicitaJogadas(int qtdeJogadas, String[] nomeJogador, String[] letraJogador,
			String[][] jogodaVelha) {
		int i = 0;
		int linhas = 0;
		int colunas = 0;
		boolean posicaoValida = false;

		if (qtdeJogadas % 2 != 0) {
			i = 1;
		}

		JOptionPane.showMessageDialog(null, nomeJogador[i] + ", sua vez!");

		do {
			linhas = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a linha:"));
			while ((linhas < 1) || (linhas > 3)) {
				linhas = Integer
						.parseInt(JOptionPane.showInputDialog(null, "Linhas de 1 à 3! \n Informe novamente a linha:"));
			}
			linhas -= 1;

			colunas = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a coluna:"));
			while ((colunas < 1) || (colunas > 3)) {
				colunas = Integer.parseInt(
						JOptionPane.showInputDialog(null, "Colunas de 1 à 3! \n Informe novamente a coluna:"));
			}
			colunas -= 1;

			if (jogodaVelha[linhas][colunas].equals(" ")) {
				jogodaVelha[linhas][colunas] = letraJogador[i];
				posicaoValida = true;
			} else {
				JOptionPane.showMessageDialog(null, "Posição já preenchida! Informe novamente.");
			}

		} while (posicaoValida == false);
		return jogodaVelha;
	}

	public static String mostraJogo(String[][] jogodaVelha) {
		String mostraJogo = "";

		int linhas = 0;
		int colunas = 0;

		for (linhas = 0; linhas < 3; linhas++) {
			for (colunas = 0; colunas < 3; colunas++) {

				mostraJogo += (" |  " + jogodaVelha[linhas][colunas] + "  | ");
			}
			mostraJogo += "\n";
		}
		return mostraJogo;
	}

	public static boolean verificaJogo(String[] letraJogador, String[][] jogodaVelha) {
		int cont = 0;
		int x = 0;
		int y = 1;
		int z = 2;
		boolean jogadorVencedor = false;

		for (cont = 0; cont < 2; cont++) {
			if (jogadorVencedor == false) {
				if (jogodaVelha[x][x] == letraJogador[cont] && jogodaVelha[y][x] == letraJogador[cont]
						&& jogodaVelha[z][x] == letraJogador[cont]) {
					jogadorVencedor = true;
				} else if (jogodaVelha[x][x] == letraJogador[cont] && jogodaVelha[y][x] == letraJogador[cont]
						&& jogodaVelha[z][x] == letraJogador[cont]) {
					jogadorVencedor = true;
				} else if (jogodaVelha[x][y] == letraJogador[cont] && jogodaVelha[y][y] == letraJogador[cont]
						&& jogodaVelha[z][y] == letraJogador[cont]) {
					jogadorVencedor = true;
				} else if (jogodaVelha[x][z] == letraJogador[cont] && jogodaVelha[y][z] == letraJogador[cont]
						&& jogodaVelha[z][z] == letraJogador[cont]) {
					jogadorVencedor = true;
				} else if (jogodaVelha[x][x] == letraJogador[cont] && jogodaVelha[x][y] == letraJogador[cont]
						&& jogodaVelha[x][z] == letraJogador[cont]) {
					jogadorVencedor = true;
				} else if (jogodaVelha[y][x] == letraJogador[cont] && jogodaVelha[y][y] == letraJogador[cont]
						&& jogodaVelha[y][z] == letraJogador[cont]) {
					jogadorVencedor = true;
				} else if (jogodaVelha[z][x] == letraJogador[cont] && jogodaVelha[z][y] == letraJogador[cont]
						&& jogodaVelha[z][z] == letraJogador[cont]) {
					jogadorVencedor = true;
				} else if (jogodaVelha[x][x] == letraJogador[cont] && jogodaVelha[y][y] == letraJogador[cont]
						&& jogodaVelha[z][z] == letraJogador[cont]) {
					jogadorVencedor = true;
				} else if (jogodaVelha[x][z] == letraJogador[cont] && jogodaVelha[y][y] == letraJogador[cont]
						&& jogodaVelha[z][x] == letraJogador[cont]) {
					jogadorVencedor = true;
				}
			}
		}
		return jogadorVencedor;
	}
}