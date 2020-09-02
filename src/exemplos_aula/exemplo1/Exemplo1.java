package exemplo1;

import java.util.Scanner;

public class Exemplo1 {

    public static void main(String [] args) {
        String nome;
        int anoNascimento;
        int idade;

        Scanner in = new Scanner(System.in);


        System.out.println("Olá, qual é o seu nome?");
        nome = in.next();
        System.out.println("Qual é o seu ano de nascimento?");
        anoNascimento = in.nextInt();

        idade = 2020 - anoNascimento;

        String resposta = "Olá, " + nome + "! Sua idade atual é de " + idade + " anos.";
        System.out.println(resposta); 

        in.close();
    }

}