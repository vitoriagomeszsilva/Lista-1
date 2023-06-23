import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o raio de um círculo para descobrir sua area:");
    
        double raio = scanner.nextDouble();

        double pi = 3.14;

        double area = 2 *(raio *pi);

        
        System.out.println("O area do circulo e "+ area);

        scanner.close();
    
    }
}
