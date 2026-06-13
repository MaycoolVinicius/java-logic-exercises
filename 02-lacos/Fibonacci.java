import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Calcule a sequencia de fibonacci para: ");
        int n = s.nextInt();

        int a = 0;
        int b = 1;
        for (int i = 1; i <= n ; i++) {
            System.out.println(a);
            int f = a + b;
            a = b;
            b = f;

        }
    }
}