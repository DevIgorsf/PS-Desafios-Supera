import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Número de linhas de entrada
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int valor = scanner.nextInt();
            if (valor % 2 == 0) {
                pares.add(valor);
            } else {
                impares.add(valor);
            }
        }

        Collections.sort(pares); // Ordena os números pares em ordem crescente
        Collections.sort(impares, Collections.reverseOrder()); // Ordena os números ímpares em ordem decrescente

        // Imprime os números pares
        for (int par : pares) {
            System.out.println(par);
        }

        // Imprime os números ímpares
        for (int impar : impares) {
            System.out.println(impar);
        }

    }
}