import java.util.Scanner;

/*Uma loja de departamentos oferece para seus clientes um determinado desconto de acordo com o valor da compra efetuada. 
O desconto é de 20% caso o valor da compra seja maior que R$ 500,00 e de 15% caso seja menor ou igual. 
Descreva um algoritmo que leia o valor da compra e escreva o total a pagar a cada compra. 
Informe também o valor total recebido pela loja ao final do dia. 
A leitura deve ser finalizada com a leitura 0 para o valor da compra.
 */
public class Uni5Exe19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o valor da compra:\nR$ ");
        double valor = input.nextDouble();

        double valorTotal = 0;
        double valorTDes20 = 0;
        double valorTDes15 = 0;


        while (valor != 0) {

            if (valor > 500) {
                double desconto20 = valor - (valor * 0.2);
                valorTDes20 += desconto20;
                System.out.print("O valor total da compra é de:\nR$ " + desconto20);

            } else {
                double desconto15 = valor - (valor * 0.15);
                valorTDes15 += desconto15;
                System.out.print("O valor total da compra é de:\nR$ " + desconto15);

            }

            System.out.print("\nInforme o valor da compra:\nR$ ");
            valor = input.nextDouble();
        }
        valorTotal = valorTDes20 + valorTDes15;

        System.out.print("O valor total recebido pela loja foi:\nR$ " + valorTotal);
        input.close();
    }
}
