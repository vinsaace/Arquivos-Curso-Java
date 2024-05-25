package tipos.primitivos;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double peso, altura, imc;
        String texto = null;

        System.out.println("Digite um peso em kilos: ");
        peso = sc.nextDouble();

        System.out.println("Digite uma altura em metros: ");
        altura = sc.nextDouble();

        imc = peso / (altura * altura);

        if (imc < 18.5){
            texto = "magro";
        } else if (imc >= 18.5 && imc <= 24.9) {
            texto = "normal";
        } else if (imc >= 25 && imc <= 29.9) {
            texto = "com sobrepeso";
        } else if (imc >= 30 && imc <= 34.9) {
            texto = "com obesidade grau 1";
        } else if (imc >= 35 && imc <= 39.9) {
            texto = "com obesidade grau 2";
        } else if (imc > 40) {
            texto = "com obesidade grau 3";
        }
        System.out.printf("O imc para uma pessoa de peso %.2f kg e altura %.2f m é %.2f, e esta %s", peso, altura, imc, texto);

    }
}
