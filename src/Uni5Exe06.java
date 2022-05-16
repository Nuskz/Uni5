import java.util.Scanner;

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
