import java.util.Scanner;

public class FaixaIMC {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Insira o peso: ");
        double peso = s.nextDouble();
        System.out.println("Insira a altura: ");
        double altura = s.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 19) {
            System.out.printf("Classificação: Abaixo do peso (IMC %.1f)%n", imc);
        } else if (imc < 25) {
            System.out.printf("Classificação: Peso normal (IMC %.1f)%n", imc);
        } else if(imc < 30) {
            System.out.printf("Classificação: Sobrepeso (IMC %.1f)%n", imc);
        } else {
            System.out.printf("Classificação: Obesidade (IMC %.1f)%n", imc);
        }

    }
}