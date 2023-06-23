import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe quantos kilos você pescou hoje ");
    
        float pesoDoPeixe = scanner.nextFloat();


        if (pesoDoPeixe >50){

            double peso_excedente = pesoDoPeixe - 50;

            double valor_da_multa = peso_excedente * 4;

            System.out.println("Você pescou mais que 50 kg hoje  ");
            System.out.println("Você foi multado em " + valor_da_multa);
        }

        else {

            System.out.println("Sua pesca não excedeu o limite");

        }
        
        scanner.close();
    
    }
}
