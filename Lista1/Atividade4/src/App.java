import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a nota do primeiro bimestre:");
        Float n_1 = input.nextFloat();

        System.out.println("Informe a nota do segundo bimestre:");
        Float n_2 = input.nextFloat();

        System.out.println("Informe a nota do terceiro bimestre:");
        Float n_3 = input.nextFloat();

        System.out.println("Informe a nota do quarto bimestre:");
        Float n_4 = input.nextFloat();

        Float resultado = (n_1 + n_2 + n_3 + n_4) / 4;
        
        System.out.println("A sua media no ano foi de :"+ resultado);

        input.close();
    }
}
