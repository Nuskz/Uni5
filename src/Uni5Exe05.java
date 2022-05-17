import java.util.Scanner;
/*Descreva um algoritmo que escreva os N primeiros termos da seguinte
 sequência de números:
    8,10,16,32,34,64...
    O valor n deve ser lido e deve ser maior do que 2.*/

public class Uni5Exe05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a quantidade desejada de termos: ");
        int quantidade = teclado.nextInt();
        teclado.close();

        int primeiroNumero = 8;
        boolean troca = true;
        System.out.print(primeiroNumero);
        for (int i = 1; i < quantidade; i++) {
            if (troca == true) {

                System.out.print("," + (primeiroNumero + 2) );

                troca = false;
            } else if (troca == false) {
                primeiroNumero = primeiroNumero * 2;
                System.out.print("," + primeiroNumero);
                troca = true;
            }
        
        }

    }
}
