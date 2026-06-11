import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = s.nextInt();

        long f = 1;
        for(int i = 1; i <= n; i++){
            f = f * i;

        }
        System.out.println(f);
    }
}