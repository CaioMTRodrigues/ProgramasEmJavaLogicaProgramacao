import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class Alg10_OrdenacaoVetor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Criar um vetor de 7 elementos
        Integer[] vetor = new Integer[7];

        // Receber os valores do usuário
        System.out.println("Digite 7 números:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = input.nextInt();
        }

        // Ordenar o vetor em ordem decrescente
        Arrays.sort(vetor,Collections.reverseOrder());

        // Exibir o vetor ordenado
        System.out.println("Vetor ordenado em ordem decrescente:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }

        input.close();
    }
}