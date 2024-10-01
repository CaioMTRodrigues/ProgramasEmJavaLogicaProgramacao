import java.util.Scanner;

public class Alg08_OperacoesMatematicas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicitar os dois números ao usuário
        System.out.print("Digite o primeiro número: ");
        double num1 = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = input.nextDouble();

        // Exibir o menu de operações
        System.out.println("Escolha a operação: ");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        // Ler a operação escolhida
        System.out.print("Digite o número da operação desejada: ");
        int operacao = input.nextInt();

        // Executar a operação escolhida
        switch (operacao) {
            case 1:
                System.out.println("Resultado da adição: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado da subtração: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado da multiplicação: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Resultado da divisão: " + (num1 / num2));
                } else {
                    System.out.println("Erro: divisão por zero não permitida.");
                }
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }

        input.close();
    }
}