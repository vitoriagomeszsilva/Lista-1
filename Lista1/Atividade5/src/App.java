import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor em metro para trasns formar centimetros ");
    
        Float metros = scanner.nextFloat();

        Float centimetros = metros * 100;
        
        System.out.println(metros + "Transformados em CM são : "+ centimetros);

        scanner.close();
    
    }
}
