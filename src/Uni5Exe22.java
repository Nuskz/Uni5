import java.text.DecimalFormat;

/*
    Um funcionário recebe aumento anual. Em 1995 foi contratado por 2000 reais. Em 1996 recebeu aumento de 1.5%. 
A partir de 1997, os aumentos sempre correspondem ao dobro do ano anterior. 

Faça programa que determine o salário atual do funcionário.
 */
public class Uni5Exe22 {
    public static void main(String[] args) {
        
        double salario = 2000;
        double porcentagem = 0;
        
        
        for (int i = 1997; i <= 2022; i++) {
            porcentagem += 2 * 0.015;
          
        }
        DecimalFormat deci = new DecimalFormat("0.00");
        salario = salario * (porcentagem); 
        System.out.println("Salário atual:\nR$ " + deci.format(salario));
    }
}
