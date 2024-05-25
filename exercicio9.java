package tipos.primitivos;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = null;
        String dia = null;

        System.out.print("Digite o dia da semana de hoje: ");
        n = sc.nextLine();

        //if (n == 7){
        //    System.out.println("Bom sabado!");
        //} else if (n == 6){
        //    System.out.println("Boa sexta!");
        //} else if (n == 5){
        //    System.out.println("Boa quinta!");
        //} else if (n == 4){
        //    System.out.println("Boa quarta!");
        //} else if (n == 3){
        //    System.out.println("Boa terça!");
        //} else if (n == 2){
        //    System.out.println("Boa segunda!");
        //} else if (n == 1) {
        //    System.out.println("Bom domingo!");
        //} else {
        //    System.out.println("Esse dia não existe");
        //}

        try {
            switch (n) {
                case 1:
                    dia = "domingo";
                    break;

                case 2:
                    dia = "segunda";
                    break;

                case 3:
                    dia = "terça";
                    break;

                case 4:
                    dia = "quarta";
                    break;

                case 5:
                    dia = "quinta";
                    break;

                case 6:
                    dia = "sexta";
                    break;

                case 7:
                    dia = "sabado";
                    break;
            }
        } catch (NumberFormatException e) {
            if (n == "domingo");
        }

        System.out.println(dia);
    }
}
