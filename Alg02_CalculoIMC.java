import java.util.Scanner;

public class Alg02_CalculoIMC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Pedir altura e peso ao usuário
        System.out.print("Digite sua altura em metros (ex: 1,75): ");
        float altura = input.nextFloat();

        System.out.print("Digite seu peso em kg: ");
        float peso = input.nextFloat();

        // Calcular o IMC
        float imc = peso / (altura * altura);
    
        // Exibir o resultado
        System.out.printf("Seu IMC é: %.2f\n", imc);

        input.close();
    }
}