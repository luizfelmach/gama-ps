import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class SomaParesOtimizado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> count = new HashMap<>();

        int n = sc.nextInt(); // Quantidade de elementos
        int valor_soma = sc.nextInt(); // Valor da soma desejado
        
        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();

            if (count.containsKey(numeros[i])) {
                count.put(numeros[i], count.get(numeros[i]) + 1);
            } else {
                count.put(numeros[i], 1);
            }
        }

        Arrays.sort(numeros);

        for (int i = 0; i < numeros.length; i++) {
            int searching = valor_soma - numeros[i];
            int index = Arrays.binarySearch(numeros, i+1, numeros.length, searching);

            if (index >= 0) {
                int freq = count.get(numeros[index]);
                while (freq--> 0) {
                    System.out.format("Pares: (%d, %d)\n", numeros[i], numeros[index]);
                }
            }
        }

        sc.close();
    }
}