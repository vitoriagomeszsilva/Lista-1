import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a temperatura em Fahrenheit para converter em Celsius :");
    
        double temp_Fahrenheit = scanner.nextDouble();

        double temp_Celsius = 5 * ((temp_Fahrenheit-32)/9);

    
        System.out.println("A temperatura en Celsius " + temp_Celsius);

        scanner.close();
    
    }
}
