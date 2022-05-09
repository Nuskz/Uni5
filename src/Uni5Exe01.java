import java.util.Scanner;

public class Uni5Exe01 {
    public static void main(String[] args) {
        // Scanner
        Scanner teclado = new Scanner(System.in);

        // Fim do Scanner

        for (int contador = 1; contador < 20; contador++) {

            System.out.println("Informe" + contador + "° número: ");
            int numero = teclado.nextInt();
            System.out.println("O número é " + (numero % 2 == 0 ? "par" : "impar"));
        }

        teclado.close();
    }
}
