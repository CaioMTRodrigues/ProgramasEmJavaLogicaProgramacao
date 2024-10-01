import java.util.Scanner;

public class Alg09_MediaPonderada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicita as quatro notas do aluno
        System.out.print("Digite a primeira nota: ");
        double nota1 = input.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        double nota2 = input.nextDouble();
        
        System.out.print("Digite a terceira nota: ");
        double nota3 = input.nextDouble();
        
        System.out.print("Digite a quarta nota: ");
        double nota4 = input.nextDouble();

        // Solicita os pesos para cada nota
        System.out.print("Digite o peso da primeira nota: ");
        int peso1 = input.nextInt();
        
        System.out.print("Digite o peso da segunda nota: ");
        int peso2 = input.nextInt();
        
        System.out.print("Digite o peso da terceira nota: ");
        int peso3 = input.nextInt();
        
        System.out.print("Digite o peso da quarta nota: ");
        int peso4 = input.nextInt();

        // Calcula a média ponderada
        double somaPesos = peso1 + peso2 + peso3 + peso4;
        double mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3 + nota4 * peso4) / somaPesos;

        // Exibe o resultado da média ponderada
        System.out.printf("A média ponderada é: %.2f\n", mediaPonderada);

        input.close();
    }
}