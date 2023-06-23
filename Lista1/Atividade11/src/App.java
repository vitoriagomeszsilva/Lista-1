import java.util.Scanner;
import java.lang.Math;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um numero inteiro:");
        int n1 = input.nextInt();

        System.out.println("Informe outro numero inteiro");
        int n2 = input.nextInt();

        System.out.println("Informe outro numero real");
        float n3 = input.nextFloat();
        

        double a = (n1 * 2) + (n2 / 2) ;

        double b = (n1 * 3) + n3;

        double c = Math.pow(n3,3);

        System.out.println("o produto do dobro do primeiro com metade do segundo é "+ a);

        System.out.println("a soma do triplo do primeiro com o terceiro é "+ b);

        System.out.println("o terceiro elevado ao cubo é "+ c);


        input.close();
    }
}
