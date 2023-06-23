import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor do lado do quadrado:");
    
        double l = scanner.nextDouble();

        double a = 2 * l;

        double dobro_area = 2 * a;

        System.out.println("A area do qudrado é " + a );
        System.out.println(" e o dorbro da area e " + dobro_area);
        scanner.close();
    
    }
}
