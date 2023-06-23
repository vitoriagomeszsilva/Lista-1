import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe quantos metros quadrados ");
    
        float metros = scanner.nextFloat();

        double latasTinta    =  (metros / 3) / 18;

        double valorPago    =  latasTinta * 80;

        System.out.println("Você deve compra "  + latasTinta + " latas para pintar " + metros + "metros");

        System.out.println("valor"  + valorPago );

        scanner.close();
    
    }
}
