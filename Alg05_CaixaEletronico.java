import java.util.Scanner;

public class Alg05_CaixaEletronico {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicita o valor desejado
        System.out.print("Digite o valor a ser sacado: R$ ");
        int valor = input.nextInt();

        if (valor % 2 != 0 && valor % 5 != 0) {
            System.out.println("Valor inválido. O valor deve ser múltiplo de 2 ou 5.");
        } else {
            // Contagem de cédulas
            int notas200 = valor / 200;
            valor %= 200;

            int notas100 = valor / 100;
            valor %= 100;

            int notas50 = valor / 50;
            valor %= 50;

            int notas20 = valor / 20;
            valor %= 20;

            int notas10 = valor / 10;
            valor %= 10;

            int notas5 = valor / 5;
            valor %= 5;

            int notas2 = valor / 2;
            valor %= 2;

            // Exibir a quantidade de cada cédula
            System.out.println("Cédulas fornecidas:");
            if (notas200 > 0) System.out.println(notas200 + " nota(s) de R$200");
            if (notas100 > 0) System.out.println(notas100 + " nota(s) de R$100");
            if (notas50 > 0) System.out.println(notas50 + " nota(s) de R$50");
            if (notas20 > 0) System.out.println(notas20 + " nota(s) de R$20");
            if (notas10 > 0) System.out.println(notas10 + " nota(s) de R$10");
            if (notas5 > 0) System.out.println(notas5 + " nota(s) de R$5");
            if (notas2 > 0) System.out.println(notas2 + " nota(s) de R$2");
        }

        input.close();
    }
}

