import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe sua altura para saber seu peso ideal : ");

        float altura = scanner.nextFloat();

        double fixo_1_H = 72.7; 
        double fixo_2H = 58 ; 

        double fixo_1_M = 62.1; 
        double fixo_2_M = 44.7 ; 

        double teste_1 = fixo_1_H * altura ;

        double teste_2 = fixo_1_M * altura ;

        double pesoidealH = teste_1 - fixo_2H;

        double pesoidealM = teste_2 - fixo_2_M;
        
        System.out.println("O peso ideal da altura " + altura + " Para homen "+ pesoidealH );
        System.out.println("O peso ideal da altura " + altura + " Para mulheres " + pesoidealM);

        scanner.close();
    
    }
}
