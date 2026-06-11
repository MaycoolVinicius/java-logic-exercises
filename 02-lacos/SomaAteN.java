import java.util.Scanner;

public class SomaAteN {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um número N");
        int n = s.nextInt();

        int soma = 0;

        for (int i = 1; i <= n; i++) {
            soma += i;
            System.out.println(soma);

        }

    }
}