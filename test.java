package tipos.primitivos;

public class test {
    public static void main(String[]args) {
        double a, b, c;
        a = 35.5;
        b = 6.8;
        c = a - b;

        System.out.println("A subtração entre " + a + " e " + b + " é " + c);
        System.out.printf("A subtração entre %.2f e %.2f é %.3f %n", a, b, c);
    }
}
