package tipos.primitivos;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        double dias, km, total;
        final double precoDia, precoKM;

        System.out.print("Digite a quantidade de dias: ");
        dias = sc.nextDouble();

        System.out.println("Digite os Km rodados: ");
        km = sc.nextDouble();

        precoDia = 86.75;
        precoKM = 1.23;

        total = (km * precoKM) + (precoDia * dias);

        System.out.printf("Foram %.2f dias %n", dias);
        System.out.printf("Foram %.2f Km %n", km);
        System.out.printf("O preço total é R$%.2f", total);
    }
}
