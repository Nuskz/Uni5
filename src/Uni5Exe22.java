import java.text.DecimalFormat;

/*
    Um funcionário recebe aumento anual. Em 1995 foi contratado por 2000 reais. Em 1996 recebeu aumento de 1.5%. 
A partir de 1997, os aumentos sempre correspondem ao dobro do ano anterior. 

Faça programa que determine o salário atual do funcionário.
 */
public class Uni5Exe22 {
    public static void main(String[] args) {

        double salario = 2000;
        double porcetagem = 0;

        DecimalFormat deci = new DecimalFormat("0.00");

        for (int i = 1997; i <= 2022; i++) {
            porcetagem += 2 * 0.015;
        }
        salario = salario * (porcetagem + 1);
        System.out.println("Salário atual do funcionário: R$" + deci.format(salario));
    }
}
