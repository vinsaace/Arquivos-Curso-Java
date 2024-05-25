package tipos.primitivos;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minutos;
        double pvariavel;

        System.out.printf("Digite quantos minutos você utilizou: ");
        minutos = sc.nextInt();

        if (minutos <= 100){
            System.out.printf("O valor a se pagar é R$79,39");
        } else if (minutos > 100){
            pvariavel = ((minutos - 100) * 2.30) + 79.39;
            System.out.printf("O valor a pagar é R$%.2f", pvariavel);
        }
    }
}
