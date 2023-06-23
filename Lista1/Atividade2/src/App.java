import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numero:");
    
        int n = scanner.nextInt();
        
        System.out.println( "nuemero :" + n);

        scanner.close();
    
    }
}
