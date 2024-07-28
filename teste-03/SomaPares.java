import java.util.Scanner;

public class SomaPares {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Quantidade de elementos
        int valor_soma = sc.nextInt(); // Valor da soma desejado
        
        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] + numeros[j] == valor_soma) {
                    System.out.println("Pares: (" + numeros[i] +
                            ", " + numeros[j] + ")");
                }
            } 
        }

        sc.close();
    }
}