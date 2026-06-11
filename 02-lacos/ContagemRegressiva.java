import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Numero para decremento: ");
        int n = s.nextInt();

        while (n >= 0) {

            System.out.println(n);
            n--;
        }
    }
}