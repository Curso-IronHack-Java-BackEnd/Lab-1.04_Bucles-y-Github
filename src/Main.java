import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numeros = {1,2,3,4,5,6,7,8,9,10};

        CalcularDiferencia(numeros);
    }

    private static void CalcularDiferencia(int[] numeros) {
        int mayor = numeros[0];
        int menor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("El mayor es: " + mayor);
        System.out.println("El menor es: " + menor);
        System.out.println("La diferencia entre el mayor y el menor es: " + (mayor - menor));

    }
}