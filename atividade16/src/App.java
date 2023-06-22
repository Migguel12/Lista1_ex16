import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Qual o tamanho da area a ser pintada: ");
        double area = ler.nextDouble();
        System.out.println("");

        double litros = area / 3;
        double lata = Math.ceil(litros/18);
        double valor = lata * 80;


        System.out.printf("Voce devera comprar %2.2f lata de tinta, vai ficar no valor de R$%2.2f.",lata,valor);


    }
}
