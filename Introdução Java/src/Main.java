
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        // receber e guardar os 10 n�meros
        int[] valores = new int[10];
        String msg = "";

        // Informa��o.
        JOptionPane.showMessageDialog(null,
                " Ol� usu�rio!" + "\n Para avalia��o de um algor�tmo, insira somente n�meros positivos.", "Usu�rio",
                JOptionPane.INFORMATION_MESSAGE);

        for (int i = 0; i < 10; i++) {
            msg = "Informe o " + (i + 1) + "� valor: ";
            // la�o de repeti��o caso informado n�mero neutro ou negativo.
            do {
                valores[i] = Integer.parseInt(JOptionPane.showInputDialog(msg));
                msg = "Voc� n�o informou um n�mero positivo!\nInforme o " + (i + 1) + "� valor: ";
            } while (valores[i] <= 0);
        }
        // criando vari�vel para armazenar se us�ario deseja encerrar o programa
        String repetir;
        // in�cio da estrutura de repeti��o para o menu
        do {
            // solicitando a op��o do menu
            int opcao = Integer.parseInt(JOptionPane.showInputDialog("O que voc� deseja ver? "
                    + "\n 1 - Todos os valores" + "\n 2 - Somente o primeiro valor" + "\n 3 - Somente o �ltimo valor"
                    + "\n 4 - Ver os valores pares" + "\n 5 - Somente o maior valor."));

            // programa��o do menu
            switch (opcao) {
                // mostrando todos os valores
                case 1:
                    for (int i = 0; i < 10; i++) {
                        JOptionPane.showMessageDialog(null, valores[i], "Valor " + (i + 1),
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                // mostrando somente o primeiro valor
                case 2:
                    JOptionPane.showMessageDialog(null, valores[0], "Primeiro valor ", JOptionPane.INFORMATION_MESSAGE);
                    break;
                // mostrando somente o �ltimo valor
                case 3:
                    JOptionPane.showMessageDialog(null, valores[9], "�ltimo valor ", JOptionPane.INFORMATION_MESSAGE);
                    break;
                // mostrando somente os valores pares
                case 4:
                    String valoresPares = "";
                    for (int i = 0; i < 10; i++) {
                        if ((valores[i] % 2) == 0) {
                            if (valoresPares != "") {
                                valoresPares += ", ";
                            }
                            valoresPares += valores[i];
                        }
                    }
                    JOptionPane.showMessageDialog(null, valoresPares, "Valores Pares ",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
                // mostrando o maior valor
                case 5:
                    int maiorValor = 0;

                    for (int i = 0; i < 10; i++) {
                        if ((valores[i] > maiorValor) || (i == 0)) {
                            maiorValor = valores[i];
                        }
                    }
                    JOptionPane.showMessageDialog(null, maiorValor, "Maior valor ", JOptionPane.INFORMATION_MESSAGE);
                    break;
                // caso a op��o seja inv�lida
                default:
                    JOptionPane.showMessageDialog(null, "Op��o inv�lida", "Erro", JOptionPane.WARNING_MESSAGE);
                    break;
            }

            // solicitando se o us��rio deseja voltar ao menu
            repetir = JOptionPane.showInputDialog(
                    "Deseja voltar ao menu? " + "\n Digite S ou s para sim ou outro caractere para encerrar:");
            // fim da estrutura de repeti��o para o menu
        } while (repetir.equals("S") || repetir.equals("s"));
    }

}