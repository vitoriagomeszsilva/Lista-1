import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a temperatura em Celsius para converter em Fahrenheit :");
    
        double tempCelsius = scanner.nextDouble();

        double tempFahrenheit = tempCelsius *1.8 +32;

    
        System.out.println("A temperatura en Fahrenheit " + tempFahrenheit);

        scanner.close();
    
    }
}
