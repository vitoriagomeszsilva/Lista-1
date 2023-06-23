import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe sua altura para saber seu peso ideal : ");
    
        float altura = scanner.nextFloat();

        double fixo1 = 72.7; 
        int fixo2 = 58 ; 

        double teste = fixo1 * altura;

        double peso_ideal = teste - fixo2;
        
        System.out.println("O seu peso ideal é "+ peso_ideal);

        scanner.close();
    
    }
}
