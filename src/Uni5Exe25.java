import java.util.Scanner;

/*
 Em uma disputa de pingue-pongue os pontos são anotados como D, ponto para o jogador do lado direito, e E, ponto para o jogador do lado esquerdo da mesa. 
 Descreva um algoritmo que leia o código do ponto de cada jogada e determine o vencedor. A partida encerra quando:

um dos jogadores chegar a 21 pontos e a diferença de pontos entre os jogadores for maior ou igual a dois;
o jogador com mais de 21 pontos conseguir uma diferença de dois pontos sobre o adversário, caso a primeira condição não seja atendida.
 
CONCLUIDA!!!!
*/
public class Uni5Exe25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int esquerdo = 0;
        int direito = 0;
        char ponto;

        System.out.print("Qual lado pontuou? (D)ireito ou (E)squerdo ");
        ponto = input.next().toUpperCase().charAt(0);
        while (ponto != 1) {
            switch (ponto) {
                case 'D':
                            direito++;
                            if (direito >= 21 && esquerdo <= (direito - 2)) {
                                System.out.println("Vitória do jogador do lado direito!");
                                return;
                            } else if (ponto == 'D' || ponto == 'E') {
                                System.out.println("\n" + esquerdo + " - " + direito + "\n");
                            }
                            break;
                case 'E':
                            esquerdo++;
                            if (esquerdo >= 21 && direito <= (esquerdo - 2)) {
                                System.out.println("Vitória do jogador do lado esquerdo!");
                                return;
                            } else if (ponto == 'D' || ponto == 'E') {
                                System.out.println("\n" + esquerdo + " - " + direito + "\n");
                            }
                            break;
                default:
                            System.out.println("Resposta inválida.");
                            break;             
            }
            System.out.print("Qual lado pontuou? (D)ireito ou (E)squerdo ");
            ponto = input.next().toUpperCase().charAt(0);
        }
        input.close();
    }
}
