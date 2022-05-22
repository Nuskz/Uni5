import java.util.Scanner;

/*Um determinado material radioativo perde metade de sua massa a cada 50 segundos. 
Dada a sua massa inicial em Kg, descreva um algoritmo que determine o 
tempo necessário para que essa massa se torne menor que 0,5 gramas. 

Escreva a massa inicial, a massa final e o tempo.
*/
public class Uni5Exe20ter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe a massa do material:\nKg ");
        double massa = input.nextDouble();

        double massaInicial = massa;
        double tempo = 0;
        double massaGramas = massa * 1000;

        while (massaGramas > 0.5) {
            for (int i = 1; i <= 50; i++) {
                if (i == 50 && massaGramas > 0.5) {
                    massaGramas -= massaGramas / 2;
                    tempo += i;
                }
            }
            if (massaGramas < 0.5) {
                System.out.println("Massa inicial: " + massaInicial + " Kg" +
                        "\nMassa Final: " + massaGramas + " Kg" + "\nTempo: " + tempo + " segundos");

            }
        }

        input.close();
    }
}
