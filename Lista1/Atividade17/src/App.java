import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe quantos metros quadrados serão pintado ");
    
        double area_pintada = scanner.nextDouble();

        int latas = (int) ((area_pintada / 6) / 18);

        int valorLata = 80;

        double precoLatas = latas * valorLata;

        int galoes =  (int) ((area_pintada / 6) / 3.6);


        int valorGalao = 25;

        double precogalao = galoes * valorGalao;


        double litrosTinta = area_pintada / 6;
        int latasMisturada = (int) litrosTinta/18;
        double litrosRestanteslata = litrosTinta - latasMisturada/18;
        double quantidadeLatasMistura = latasMisturada + litrosRestanteslata/3.6;
    
        double valorlatasMistura = quantidadeLatasMistura * valorLata;


        double galoesMistura = area_pintada / 6;
        int latasmisturada = (int) galoesMistura/18;
        double litrosRestantes = litrosTinta - latasmisturada/18;
        double quantidadeGaloesMistura = litrosRestantes/3.6;

        double valorgaloesMistura = quantidadeLatasMistura * valorGalao;

        double precoMistura = valorlatasMistura + valorgaloesMistura;


        System.out.println("Comprar apenas latas de 18 litros");
        System.out.println("latas" + latas);
        System.out.println("Preço" + precoLatas);
        
        System.out.println("Comprar apenas galões de 3,6 litros");
        System.out.println("Quantidade " + galoes);
        System.out.println("Preço" + precogalao);
        
        System.out.println("Misturar latas e galões");
        System.out.println("latas" + quantidadeLatasMistura);
        System.out.println("galões" + quantidadeGaloesMistura);
        System.out.println("Preço" + precoMistura);

        scanner.close();
    }


    
    

  
     


    


}
