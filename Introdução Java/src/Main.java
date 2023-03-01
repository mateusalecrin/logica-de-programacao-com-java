
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        // receber e guardar os 10 números
        int[] valores = new int[10];
        String msg = "";

        // Informação.
        JOptionPane.showMessageDialog(null,
                " Olá usuário!" + "\n Para avaliação de um algorítmo, insira somente números positivos.", "Usuário",
                JOptionPane.INFORMATION_MESSAGE);

        for (int i = 0; i < 10; i++) {
            msg = "Informe o " + (i + 1) + "º valor: ";
            // laço de repetição caso informado número neutro ou negativo.
            do {
                valores[i] = Integer.parseInt(JOptionPane.showInputDialog(msg));
                msg = "Você não informou um número positivo!\nInforme o " + (i + 1) + "º valor: ";
            } while (valores[i] <= 0);
        }
        // criando variável para armazenar se usúario deseja encerrar o programa
        String repetir;
        // início da estrutura de repetição para o menu
        do {
            // solicitando a opção do menu
            int opcao = Integer.parseInt(JOptionPane.showInputDialog("O que você deseja ver? "
                    + "\n 1 - Todos os valores" + "\n 2 - Somente o primeiro valor" + "\n 3 - Somente o último valor"
                    + "\n 4 - Ver os valores pares" + "\n 5 - Somente o maior valor."));

            // programação do menu
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
                // mostrando somente o último valor
                case 3:
                    JOptionPane.showMessageDialog(null, valores[9], "Último valor ", JOptionPane.INFORMATION_MESSAGE);
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
                // caso a opção seja inválida
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida", "Erro", JOptionPane.WARNING_MESSAGE);
                    break;
            }

            // solicitando se o usúário deseja voltar ao menu
            repetir = JOptionPane.showInputDialog(
                    "Deseja voltar ao menu? " + "\n Digite S ou s para sim ou outro caractere para encerrar:");
            // fim da estrutura de repetição para o menu
        } while (repetir.equals("S") || repetir.equals("s"));
    }

}