import java.util.Scanner;

public class Alg04_OrdenacaoTresNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicitar três números ao usuário
        System.out.print("Digite o primeiro número: ");
        int num1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = input.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = input.nextInt();

        // Variáveis para armazenar os números em ordem crescente
        int menor, meio, maior;

        // Comparar os números e organizá-los
        if (num1 <= num2 && num1 <= num3) {
            menor = num1;
            if (num2 <= num3) {
                meio = num2;
                maior = num3;
            } else {
                meio = num3;
                maior = num2;
            }
        } else if (num2 <= num1 && num2 <= num3) {
            menor = num2;
            if (num1 <= num3) {
                meio = num1;
                maior = num3;
            } else {
                meio = num3;
                maior = num1;
            }
        } else {
            menor = num3;
            if (num1 <= num2) {
                meio = num1;
                maior = num2;
            } else {
                meio = num2;
                maior = num1;
            }
        }

        // Exibir os números em ordem crescente
        System.out.println("Os números em ordem crescente são: " + menor + ", " + meio + ", " + maior);

        input.close();
    }
}
