package exercicios;

public class exercicio1 {
    public static void main(String[]args){

        String gameRPG = "Pokémon", gameIndie = "Undertale";

        int age = 35;
        int code = 2367;
        char gender = 'M';

        double priceRPG = 107.80;
        double priceIndie = 46.99;

        double media = (priceIndie + priceRPG)/2;

        System.out.print("Produtos: ");
        System.out.println("Pokémon esta custando R$" + priceRPG);
        System.out.printf("%s esta custando R$%f %n", gameIndie,  priceIndie);
        // sout = System.out.println();

        System.out.println("O comprador tinha " + age + ", seu código é " + code + " e seu gênero é " + gender);
        System.out.println("A média dos games é: R$" + media);
        System.out.printf("A média de texto arredondada é R$.2f", media);




    }
}
