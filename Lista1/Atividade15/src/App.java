import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe quantas horas você trabalha por mês");

        float horasMes = scanner.nextFloat();

        System.out.println("Informe quanto você ganha por hora");
    
        float valorhora = scanner.nextFloat();

        double salarioBruto = valorhora * horasMes;

        System.out.println("salario Bruto " + salarioBruto);

        double inss =  salarioBruto * 0.08;

        System.out.println("Valor INSS " + inss );

        double ir= salarioBruto * 0.11 ;

        System.out.println("Valor Imposto de Renda" + ir);

        double sindicato = salarioBruto * 0.05 ; 

        System.out.println("Valor pago para sindicato " + sindicato);

        double salario_liquido = salarioBruto -  inss - ir - sindicato ; 
        
        System.out.println("salario Liquido " + salario_liquido);



        scanner.close();
    
    }
}
