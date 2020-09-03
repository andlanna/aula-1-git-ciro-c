import java.util.Scanner;

import javax.swing.JOptionPane;


public class Exercicio3 {
    public static void main(String[] args) {
        String[] opcoes = new String[] {"Visual", "Console", "Cancela"};
        String[] escolha = new String[] {"Verificar se um triângulo existe", "Calcular area e perímetro de um poligono", "Sair"};
        double ladoA, ladoB, ladoC;
        char tipo;
        int numeroConsole;
        int resposta = JOptionPane.showOptionDialog(
        null,
        "Como quer prosseguir com o programa?",
        "Escolha uma opção",
        JOptionPane.DEFAULT_OPTION,
        JOptionPane.PLAIN_MESSAGE,
        null, opcoes, opcoes[0]
         );

        switch (resposta) {
            case 0:
                int numeroGrafico = JOptionPane.showOptionDialog(
                    null,
                    "O que quer fazer",
                    "Selecione uma opção",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null, escolha, escolha[0]
                 );
                
                 String strLadoA = JOptionPane.showInputDialog("Valor do lado A");
                 ladoA = Integer.parseInt(strLadoA);
                 String strLadoB = JOptionPane.showInputDialog("Valor do lado B");
                 ladoB = Integer.parseInt(strLadoB);

                switch (numeroGrafico) {
                    case 0:
                        String strLadoC = JOptionPane.showInputDialog("Valor do lado C");
                        ladoC = Integer.parseInt(strLadoC);

                        if(
                            validaLado(ladoA, ladoB, ladoC) &&
                            validaLado(ladoB, ladoA, ladoC) &&
                            validaLado(ladoC, ladoA, ladoB)
                         ) {
                            
                            JOptionPane.showMessageDialog(null,"O triângulo é possivel");
                        }else{
                            JOptionPane.showMessageDialog(null,"O triângulo não é possivel");
                        }

                        break;
                
                    case 1:
                        String strTipo = JOptionPane.showInputDialog("Digite (T) para selecionar triângulo ou (R) para retângulo");
                        tipo = strTipo.charAt(0);

                        switch (tipo) {
                            case 'T':
                                JOptionPane.showMessageDialog(null,"Triângulo de lados " + ladoA + " e " + ladoB + " possui\n Área: " + area(ladoA, ladoB, tipo) + "\n Perímetro: " + perimetro(ladoA, ladoB, tipo) );
                                break;
                
                            case 'R':
                                JOptionPane.showMessageDialog(null,"Retângulo de lados " + ladoA + " e " + ladoB + " possui\n Área: " + area(ladoA, ladoB, tipo) + "\n Perímetro: " + perimetro(ladoA, ladoB, tipo)  );    
                                break;
                
                            default:
                                System.out.println("Nenhum polígono selecionado. Saindo do programa");
                                break;
                        }

                        break;

                    default:
                        break;
                }



                break;

            case 1:
                System.out.println("O que quer fazer?\n (1)Verificar se um triângulo existe\n (2)Calcular area e perímetro de um poligono\n Para sair digite qualquer outro número");
                Scanner in = new Scanner(System.in);
                numeroConsole = in.nextInt();

                switch (numeroConsole) {
                    case 1:
                        System.out.println("Digite o 1 lado do triangulo");
                        ladoA = in.nextDouble();
                        System.out.println("Digite o 2 lado do triangulo");
                        ladoB = in.nextDouble();
                        System.out.println("Digite o 3 lado do triangulo");
                        ladoC = in.nextDouble();

                        in.close();

                        if(
                            validaLado(ladoA, ladoB, ladoC) &&
                            validaLado(ladoB, ladoA, ladoC) &&
                            validaLado(ladoC, ladoA, ladoB)
                         ) {
            
                           System.out.println("O triângulo é possivel");
                        }else{
                            System.out.println("O triângulo não é possivel");
                        }

                        break;
                    
                    case 2:
                    System.out.println("Digite o 1 lado do polígono");
                    ladoA = in.nextDouble();
                    System.out.println("Digite o 2 lado do polígono");
                    ladoB = in.nextDouble();
                    System.out.println("Qual é o polígono? Digite: \n (T) para triângulo retângulo \n (R) para retângulo");
                    tipo = in.next().charAt(0);

                    in.close();

                    switch (tipo) {
                        case 'T':
                            System.out.println("Triângulo de lados " + ladoA + " e " + ladoB + " possui\n Área: " + area(ladoA, ladoB, tipo) + "\n Perímetro: " + perimetro(ladoA, ladoB, tipo) );
                            break;
            
                        case 'R':
                            System.out.println("Retângulo de lados " + ladoA + " e " + ladoB + " possui\n Área: " + area(ladoA, ladoB, tipo) + "\n Perímetro: " + perimetro(ladoA, ladoB, tipo) );
                            break;
            
                        default:
                            System.out.println("Nenhum polígono selecionado. Saindo do programa");
                            break;
                    }
                        break;
                
                    default:
                        break;
                }

                break;
            default:
                break;
        }
    }

    public static double area (double ladoA, double ladoB, char tipo) {
        double total = 0.0d;
        
        if(tipo == 'T') {
            total = (ladoA*ladoB)/2;
        }else {
            total = ladoA*ladoB;
        }
        return total;
    }

    public static double perimetro (double ladoA, double ladoB, char tipo) {
        double soma = 0.0d;
        double ladoC = 0.0d;

        if(tipo == 'T') {
            ladoC = ladoA*ladoA + ladoB*ladoB;
            ladoC = Math.sqrt(ladoC);
            soma = ladoA + ladoB + ladoC;
        }else {
            soma = 2*ladoA + 2*ladoB;
        }
        return soma;
    }

    public static boolean validaLado( Double ladoA, Double ladoB, Double ladoC ) {
        Double modulo = 0.0d;

        if(ladoA >= 0 && ladoB >=0 && ladoC >= 0) {

            modulo = ladoB - ladoC;

            if(modulo < 0.0){
                modulo = modulo*(-1);
            }

            if(modulo < ladoA && ladoA < (ladoB + ladoC)){
                return true;
            }

            return false;

        }else {
            return false;
        }
         
    }
}

