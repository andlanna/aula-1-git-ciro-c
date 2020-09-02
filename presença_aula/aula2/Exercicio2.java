import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        double ladoA, ladoB;
        char tipo;

        Scanner in = new Scanner(System.in);

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
}
