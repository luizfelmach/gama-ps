import java.util.Arrays;

public class SomaParesOtimizado {

    public static void main(String[] args) {

        int[] numeros = { 1, 4, 5, 2, 7, 9, -1 };

        int valor_soma = 6;

        Arrays.sort(numeros);

        for (int i = 0; i < numeros.length; i++) {
            int searching = valor_soma - numeros[i];
            int index = Arrays.binarySearch(numeros, i+1, numeros.length, searching);

            if (index == i) continue;

            if (index >= 0) {
                System.out.format("Pares: (%d, %d)\n", numeros[i], numeros[index]);
            }
        }
    }
}