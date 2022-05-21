import java.util.Scanner;

/*Um comerciante deseja fazer um levantamento do lucro das 20 mercadorias que comercializa. 
Para cada mercadoria ele tem o nome, o preço de compra (PC) e o preço de venda (PV). Descreva um algoritmo que:

escreva quantas mercadorias proporcionam: (lucro < 10%), (10% <= lucro <= 20%) e (lucro > 20%), 
onde o percentual de lucro é calculado da seguinte forma: % = (PV - PC) / PC * 100;
determine e escreva o valor total de compra e de venda de todas as mercadorias, assim como o lucro total.*/
public class Uni5Exe14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double lucro = 0;
        double pc = 0;
        double pv = 0;
        String nome = "";

        for (int cont = 1; cont <= 20; cont++) {

            System.out.println("Informe o nome da " + cont + "ª mercadoria");
            nome = teclado.next();

            System.out.print("Qual o valor pago nela? \nR$ ");
            pc = teclado.nextDouble();

            System.out.println("Qual o valor da venda ");
            pv = teclado.nextDouble();
            
            lucro = (pv - pc) / pc * 100;

            if (lucro < 0.1) {
                System.out.println("A mercadoria " + nome + " tem um lucro abaixo de 10%");

            } else if (lucro >= 0.1 && lucro <= 0.2 ){
                
            }
            
            
        }

        teclado.close();
    }

}
