import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a velocidadeinternet  ");
        double Internet = scanner.nextDouble();

        System.out.print("Digite o tamanho do arquivo");
        double tamanhoMB = scanner.nextDouble();

        double bits = tamanhoMB * 8* 1024 *1024;
        double tempoS = bits / (Internet * 1024 * 1024);
        double tempoMi= tempoS / 60;

        System.out.println(" download: " + tempoMi + " minutos");

        scanner.close();
    }
}
