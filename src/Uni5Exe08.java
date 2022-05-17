import java.util.Scanner;

public class Uni5Exe08 {
    /*
     * Descreva um algoritmo que leia um número inteiro n e, dados n números
     * inteiros, descreva um algoritmo que:
     * 
     * escreva o menor valor negativo;
     * escreva a média dos números positivos.
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe quantos números quer escrever: ");
        int quantidade = teclado.nextInt();

        int numeroNegativo = 0;
        int numeroPositivo = 0;
        double media = 0;
        double entrada = 0;

        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Informe o " + i + "º número: ");
            int nInt = teclado.nextInt();

            if (nInt > 0) {
                entrada++;
                numeroPositivo += nInt;
                media = numeroPositivo / entrada;

            } else {
                numeroNegativo = nInt;
                if (numeroNegativo < nInt) {
                    numeroNegativo = nInt;
                }
            }
        }
        System.out.println("O menor número negativo é " + numeroNegativo);
        System.out.println("A média dos números positivos é " + media);

        teclado.close();
    }
}