import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor da sua hora trabalhada:");

        double salariohora = scanner.nextDouble();

        System.out.println("Informe quantas horas voce trabalhada por mes:");

        double h_mes = scanner.nextDouble();

        double Salario = salariohora * h_mes;


        System.out.println("Seu salario mensal é " + Salario);

        scanner.close();
    
    }
}
