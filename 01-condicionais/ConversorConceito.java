import java.util.Scanner;

public class ConversorConceito {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite a nota: ");
        int nota = s.nextInt();

        if(nota > 100 || nota < 0) {
            System.out.println("A nota deve estar entre 0 e 100!!");
        } else if(nota >= 90) {
            System.out.println("Parabéns! Nota A");
        } else if (nota >= 80) {
            System.out.println("Parabéns! Nota B");
        } else if (nota >= 70) {
            System.out.println("Nota C");
        } else if (nota >= 60) {
            System.out.println("Nota D");
        } else {
            System.out.println("Nota F");
        }
    }
}