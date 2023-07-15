import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Tamanho do array
        int k = scanner.nextInt(); // Valor alvo

        int[] arr = new int[n]; // Array de inteiros

        // Preenche o array com os valores fornecidos
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = countPairsWithDifference(arr, k);
        System.out.println(count);
    }

    private static int countPairsWithDifference(int[] arr, int k) {
        Arrays.sort(arr); // Ordena o array em ordem crescente

        int count = 0;
        int i = 0;
        int j = 1;

        while (j < arr.length) {
            int diff = arr[j] - arr[i];
            if (diff == k) {
                count++;
                j++;
            } else if (diff > k) {
                i++;
            } else { // diff < k
                j++;
            }
        }

        return count;
    }
}