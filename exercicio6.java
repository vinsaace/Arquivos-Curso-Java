package tipos.primitivos;

import java.util.Random;
import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd;

        String nome, curso;
        byte idade;
        char genero;
        String ra;

        System.out.println("Digte seu nome: ");
        nome = sc.nextLine();

        System.out.println("Digite sua idade");
        idade = sc.nextByte();
        sc.nextLine();

        System.out.println("Digite seu gênero: ");
        String text = sc.nextLine();
        genero = text.toUpperCase().charAt(0);

        System.out.println("Digite seu curso: ");
        curso = sc.nextLine();
        ra = nome.charAt(0) + rd.nextInt(bound: 100);
    }
}
