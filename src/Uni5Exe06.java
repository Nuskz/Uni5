import java.util.Scanner;
<<<<<<< HEAD
/*Descreva um algoritmo que leia a altura de 20 pessoas e calcule a média de altura das mesmas.
//COMPLETOOO!!!!!!!!! */

=======
//COMPLETOOO!!!!!!!!!
>>>>>>> 1de8348d01c6ef8f2aeeb710c4af5347bad37119
public class Uni5Exe06 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double altura = 0;
        for (int i = 1; i <= 20; i++) {
            System.out.println("Informe a altura da " + i + "ª Pessoa");
            altura += teclado.nextDouble();

        }
        double media = altura / 20;
        System.out.println("A média é: " + media);

        teclado.close();

    }
}
