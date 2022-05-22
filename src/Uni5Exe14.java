import java.text.DecimalFormat;
import java.util.Scanner;

/*Um comerciante deseja fazer um levantamento do lucro das 20 mercadorias que comercializa. 
Para cada mercadoria ele tem o nome, o preço de compra (PC) e o preço de venda (PV). Descreva um algoritmo que:

escreva quantas mercadorias proporcionam: (lucro < 10%), (10% <= lucro <= 20%) e (lucro > 20%), 
onde o percentual de lucro é calculado da seguinte forma: % = (PV - PC) / PC * 100;
determine e escreva o valor total de compra e de venda de todas as mercadorias, assim como o lucro total.*/
public class Uni5Exe14ter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");

        double lucro = 0;
        double pc = 0;
        double pv = 0;
        String nome = "";
        double lucroTotal = 0;
        double pcTotal = 0, pvTotal = 0;
        double contador = 0;

        for (int i = 1; i <= 20; i++) {
            contador++;
            System.out.println("Informe o nome da " + i + "ª mercadoria");
            nome = input.next();

            System.out.print("Qual o valor pago nela? \nR$ ");
            pc = input.nextDouble();

            System.out.print("\nQual o valor da venda? \nR$ ");
            pv = input.nextDouble();

            pcTotal += pc;
            pvTotal += pv;
            lucro = (pv - pc) / pc * 100;

            if (lucro < 10) {
                System.out.print("A mercadoria " + nome + " tem um lucro de: " + deci.format(lucro) + "%");

            } else if (lucro >= 10 && lucro <= 20) {
                System.out.print("A mercadoria " + nome + " tem um lucro de: " + deci.format(lucro) + "%");
            } else if (lucro > 20) {
                System.out.print("A mercadoria " + nome + " tem um lucro de: " + deci.format(lucro) + "%");
            }

        }
        lucroTotal = (pvTotal - pcTotal) / pcTotal * 100;
        lucroTotal = lucroTotal / contador;
        System.out.print("\nTotal do valor de compra das mercadorias: R$" + pcTotal);
        System.out.print("\nTotal do valor de venda das mercadorias: R$" + pvTotal);
        System.out.print("\nO lucro total: R$" + deci.format(lucroTotal));

        input.close();
    }

}
