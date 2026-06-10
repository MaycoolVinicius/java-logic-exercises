import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o tamanho dos lados dos triangulos:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if(a + b <= c || a + c <= b || b + c <= a){
            System.out.println("Não é um triangulo");
        }
        else if (a == b && a == c){
            System.out.println("Triangulo Equilátero");
        } else if(a == b || a == c || b == c) {
            System.out.println("Triangulo Isósceles");
        } else {
            System.out.println("Triangulo Escaleno");
        }

    }
}