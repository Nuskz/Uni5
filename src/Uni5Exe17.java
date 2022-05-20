import java.text.DecimalFormat;
import java.util.Scanner;

/*Descreva um algoritmo que leia o número de inscrição e a altura de um atleta em uma competição e informe:

o número de inscrição e a altura do atleta mais alto;
o número de inscrição e a altura do atleta mais baixo;
a altura média do grupo de atletas.
A leitura deve ser finalizada ao digitar 0 para o número de inscrição.*/
public class Uni5Exe17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o número da inscrição: ");
        int inscrição = input.nextInt();

        int insBaixo = 0;
        int insAlto = 0;

        double alturaTotal = 0;
        double altura = 0;
        double alturaBaixo = Integer.MAX_VALUE;
        double alturaAlto = Integer.MIN_VALUE;
        double media = 0;
        double cont = 0;

        while (inscrição != 0) {
            cont++;
            System.out.print("Informe a altura em metros: ");
            altura = input.nextDouble();

            if (altura < alturaBaixo) {
                insBaixo = inscrição;
                alturaBaixo = altura;

            }
            if (altura > alturaAlto) {
                insAlto = inscrição;
                alturaAlto = altura;

            }

            alturaTotal += altura;

            System.out.print("Informe o número da inscrição: ");
            inscrição = input.nextInt();

        }
        media = alturaTotal / cont;

        DecimalFormat form = new DecimalFormat("0.00");

        System.out.println("O atleta mais baixo é o " + insBaixo + " com uma altura de " + form.format(alturaBaixo) + " m");
        System.out.println("O atleta mais alto é o " + insAlto + " com uma altura de " + form.format(alturaAlto) + " m");
        System.out.println("A altura média dos atletas é: " + form.format(media) + " m");

        input.close();
    }
}
