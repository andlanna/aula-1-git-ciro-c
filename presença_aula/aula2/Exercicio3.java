//import java.util.Scanner;
import javax.swing.JOptionPane;


public class Exercicio3 extends Exercicio1 {
    private class Auxiliar extends Exercicio2 {
        String[] opcoes = new String[] {"Visual", "Console", "Cancela"};
        int resposta = JOptionPane.showOptionDialog(
            null,
            "Como quer prosseguir com o programa?",
            "Escolha uma opção",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.PLAIN_MESSAGE,
            null, opcoes, opcoes[0]);
        System.out.println(resposta);
        /*switch (resposta) {
            case 0:
                
                break;
            case 1:
                
                break;
            default:
                break;
        }*/
    }
}

