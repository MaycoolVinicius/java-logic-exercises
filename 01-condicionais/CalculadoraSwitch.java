/*
1. CalculadoraSwitch
Lê dois números e uma operação, imprime o resultado.

Leia double a, double b e a operação como char: char op = scanner.next().charAt(0);
Use switch (op) com case '+':, case '-':, case '*':, case '/': e um default para operador inválido
Armadilha 1: esquecer o break em cada case — deixe acontecer uma vez de propósito e observe o resultado
Armadilha 2: divisão por zero. Dentro do case '/', valide b antes de dividir
 */

import java.util.Scanner;

public class CalculadoraSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a: ");
        double a = sc.nextDouble();
        System.out.println("Insira b: ");
        double b = sc.nextDouble();
        System.out.println("Insira a operação: ");
        char op = sc.next().charAt(0);
        switch (op){
            case '+':
                System.out.println("Resultado: " + (a + b));
                break;

            case '-':
                System.out.println("Resultado: " + (a - b));
                break;

            case '/': {
                if (b == 0) {
                    System.out.println("Não existe divisão por 0");
                } else {
                    System.out.println("Resultado: " + (a / b));
                }
            }
                break;

            case '*':
                System.out.println("Resultado: " + (a * b));
                 break;
            default:
                System.out.println("Opção inválida.");
            }

        }

    }
