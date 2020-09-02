
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Float ladoX, ladoY, ladoZ;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o 1 lado do triangulo");
        ladoX = in.nextFloat();
        System.out.println("Digite o 2 lado do triangulo");
        ladoY = in.nextFloat();
        System.out.println("Digite o 3 lado do triangulo");
        ladoZ = in.nextFloat(); 

        in.close();

        if(
            validaLado(ladoX, ladoY, ladoZ) &&
            validaLado(ladoY, ladoX, ladoZ) &&
            validaLado(ladoZ, ladoX, ladoY)
            ) {
            
                System.out.println("O triângulo é possivel");
        }else{
            System.out.println("O triângulo não é possivel");
        }
    }

    public static boolean validaLado( Float ladoA, Float ladoB, Float ladoC ) {
        Float modulo;

        if(ladoA >= 0 && ladoB >=0 && ladoC >= 0) {

            modulo = ladoB - ladoC;

            if(modulo < 0){
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
