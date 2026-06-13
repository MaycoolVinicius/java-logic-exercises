import java.util.Random;
import java.util.Scanner;

public class JogoDeAdvinhacao {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random random = new Random();

        int segredo = random.nextInt(100) + 1;
                System.out.println("Qual o número secreto?");
        int chute = s.nextInt();
        int contador = 1;
        while(chute != segredo) {
            contador ++;
            if (segredo > chute){
                System.out.println("Maior!");
            } else{
                System.out.println("Menor!");
            }
            chute = s.nextInt();
        }
        System.out.printf("Você acertou em %d tentativas", contador );


    }
}