import java.util.Scanner;

public class Alg03_IMCClassificacao {
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

        // Interpretar o IMC
        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso.");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Você está com peso normal.");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Você está com sobrepeso.");
        } else {
            System.out.println("Você está com obesidade.");
        }

        input.close();
    }
}
