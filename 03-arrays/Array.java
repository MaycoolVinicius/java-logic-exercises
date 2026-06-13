public class Array {
    public static void main(String[] args) {

        int [] numeros = {-5, -1, -3};

        int menor = numeros [0];

        for (int i = 1; i < numeros.length; i++) {

            if (numeros[i] < menor){
                menor = numeros[i];

            }
        }
        System.out.println(menor);

    }
}