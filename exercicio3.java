package tipos.primitivos;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[]args){
        double c, f, k;

        System.out.printf("Digite a temperatura em Celsious para ser convertido: ");
        Scanner sc = new Scanner(System.in);
        c = sc.nextDouble();
        f = (c * 1.8) + 32;
        k = c + 273;

        System.out.printf("A temperatura %.2f Celsius em Fahrenheit é %.2f %n", c, f);
        System.out.printf("A temperatura %.2f Celsius em Kelvin é %.2f", c, k);

        sc.close();
    }
}
