import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Número de casos de teste
        scanner.nextLine(); // Consumir a quebra de linha

        for (int i = 0; i < n; i++) {
            String linha = scanner.nextLine();
            String linhaDecifrada = decifrarLinha(linha);
            System.out.println(linhaDecifrada);
        }
    }

    private static String decifrarLinha(String linha) {
        int meio = linha.length() / 2; // Índice do meio da linha
        String parteEsquerda = linha.substring(0, meio); // Parte esquerda da linha
        String parteDireita = linha.substring(meio); // Parte direita da linha

        // Inverter as partes esquerda e direita
        parteEsquerda = new StringBuilder(parteEsquerda).reverse().toString();
        parteDireita = new StringBuilder(parteDireita).reverse().toString();

        return parteEsquerda + parteDireita;
    }
}