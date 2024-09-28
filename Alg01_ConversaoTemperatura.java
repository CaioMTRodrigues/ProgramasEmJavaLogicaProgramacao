import java.util.Scanner;

public class Alg01_ConversaoTemperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicita a temperatura em graus Celsius
        System.out.print("Qual a temperatura atual em graus Celsius? ");
        double celsius = input.nextDouble();

        // Converte Celsius para Kelvin e Fahrenheit
        double kelvin = celsius + 273.15;
        double fahrenheit = (celsius * 9/5) + 32;

        // Exibe os resultados
        System.out.println("A temperatura em Celsius: " + celsius + "°C");
        System.out.println("A temperatura em Kelvin: " + kelvin + " K");
        System.out.println("A temperatura em Fahrenheit: " + fahrenheit + "°F");

        input.close();
    }
}
