import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe dois numeros para saber a soma:");
    
        int n_1 = input.nextInt();

        int n_2 = input.nextInt();

        int resultado = n_1 + n_2;

        System.out.println("A soma de " + n_1 + " é " + n_2 + " = " + resultado);

        input.close();
    }
}
