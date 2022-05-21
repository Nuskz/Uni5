import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Em uma eleição para presidência, existem 4 candidatos.
 * Os votos são informados através de código.
 * Os dados utilizados para votação obedecem a seguinte codificação:
 * 
 * 1, 2, 3, 4 = voto para o respectivo candidato;
 * 5 = voto nulo;
 * 6 = voto em branco.
 * Elabore um programa que calcule e escreva:
 * 
 * total de votos para cada candidato;
 * total de votos nulos;
 * total de votos em branco;
 * percentual dos votos em branco e nulos sobre o total.
 * Se o usuário informar um número de operação incorreto,
 * emitir a mensagem “Opção incorreta” e persistir solicitando um número de
 * opção correto.
 * Para interromper a operação, o usuário poderá fornecer o número 0.
 * CONCLUIDA!!!!
 */
public class Uni5Exe33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");

        int cand1 = 0, cand2 = 0, cand3 = 0, cand4 = 0;
        int nulo = 0;
        int branco = 0;
        int voto = 0;

        do {
            System.out.println(
                    "Informe o seu voto:\n1, 2, 3 ou 4 para os candidatos\n5 para nulo \n6 para votar em branco");
            voto = input.nextInt();

            switch (voto) {
                case 1:
                    cand1++;
                    break;

                case 2:
                    cand2++;
                    break;

                case 3:
                    cand3++;
                    break;

                case 4:
                    cand4++;
                    break;

                case 5:
                    nulo++;
                    break;

                case 6:
                    branco++;
                    break;

                default:
                    System.out.println("Opção incorreta");

            }

        } while (voto != 0);

        double totalVotos = cand1 + cand2 + cand3 + cand4 + nulo + branco;
        double perNulo = (nulo / totalVotos) * 100;
        double perBranco = (branco / totalVotos) * 100;

        System.out.println("Candidato 1: " + cand1 + "\nCandidato 2: " + cand2 
        + "\nCandidato 3: " + cand3 + "\nCandidato 4: " + cand4
        + "\n Votos em branco: " + branco + "\nVotos nulos: " + nulo);

        System.out.println("Percentual de votos:\nBrancos: " + deci.format(perBranco) + "% " 
        + "Nulos: " + deci.format(perNulo) + "% ");

        input.close();
    }
}


