import java.util.Scanner;

public class MaiorDeTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite três números");
        System.out.println("Número 1: ");
        int a = scanner.nextInt();
        System.out.println("Número 2: ");
        int b = scanner.nextInt();
        System.out.println("Número 3: ");
        int c = scanner.nextInt();

        if (a >= b && a >= c) {
            System.out.println("O maior é " + a);
        } else if (b >= a && b >= c) {
            System.out.println("O maior é " + b);
        } else {
            System.out.println("O maior é " + c);
        }
    }
}