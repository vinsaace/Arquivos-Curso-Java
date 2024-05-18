package tipos.primitivos;
import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[]args) {
        // final double são valores que nunca irão mudar
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double r, a, pi;

        pi = Math.PI;
        System.out.printf("Insira um raio para calcular a area do circulo: ");
        r = sc.nextDouble();
        a = pi * Math.pow(r, 2);

        System.out.printf("A área do circulo de raio %.2f é %.2f %n", r, a);




        sc.close();
    }
}
