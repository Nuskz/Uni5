import java.util.Scanner;

/*Um determinado material radioativo perde metade de sua massa a cada 50 segundos. 
Dada a sua massa inicial em Kg, descreva um algoritmo que determine o 
tempo necessário para que essa massa se torne menor que 0,5 gramas. 

Escreva a massa inicial, a massa final e o tempo.
*/
public class Uni5Exe20 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe a massa do material:\nKg ");
        double massa = input.nextDouble();

        double massaInicial = massa;
        double tempo = 0;

        while (massa >= 0.0005) {
            for (int i = 1; i <= 50; i++) {
                if (i == 50 || massa > 0.0005) {
                    massa = (massa / 2);
                    tempo += i;
                }
            }
        }
        System.out.println("Massa inicial: " + massaInicial + " Kg" +
                "\nMassa Final: " + massa + " Kg" + "\nTempo: " + tempo + " segundos");
        
        input.close();
    }
}
