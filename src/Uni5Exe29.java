import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Um caixa automático possui cédulas de 1, 2, 5, 10 e 20.
 * Faça um programa que leia um valor e informe a quantidade mínima de cédulas
 * que ele precisará combinar para entregar o valor solicitado. Por exemplo: se
 * o valor for 6, então ele fornecerá uma cédula de 5 e outra de 1.
 * Se o número for 47, então ele fornecerá duas cédulas de 20, uma de 5 e outras
 * de 2.
 */
public class Uni5Exe29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o valor que deseja sacar: R$ ");
        int valor = input.nextInt();

        DecimalFormat deci = new DecimalFormat("0.00");

        System.out.println("R$" + deci.format(valor));
        System.out.println((valor / 20) + " cédula(s) de R$20,00");
        valor %= 20;
        System.out.println((valor / 10) + " cédula(s) de R$10,00");
        valor %= 10;
        System.out.println((valor / 5) + " cédula(s) de R$5,00");
        valor %= 5;
        System.out.println((valor / 2) + " cédula(s) de R$2,00");
        valor %= 2;
        System.out.println((valor / 1) + " cédula(s) de R$1,00");
        valor %= 1;
        
        input.close();
    }
}
