public class SomaPares {

    public static void main(String[] args) {

        int[] numeros = { 1, 4, 5, 2, 7, 9, -1 };

        int valor_soma = 6;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] + numeros[j] == valor_soma) {
                    System.out.println("Pares: (" + numeros[i] +
                            ", " + numeros[j] + ")");
                }
            } 
        }
    }
}