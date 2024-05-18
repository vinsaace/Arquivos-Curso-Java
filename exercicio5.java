package tipos.primitivos;

import java.time.LocalDate;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate data = LocalDate.now();
        int an, aa, idade;

        System.out.println("Digite o ano que você nasceu: ");
        an = sc.nextShort();

        aa = LocalDate.now().getYear();

        idade = aa - an;

        System.out.printf("Sua idade é %d anos", idade);
    }
}
