import java.util.Scanner;

public class Uni5Exe07 {
    /*Descreva um algoritmo que leia um número inteiro n e, 
    dados n números reais informe o maior e o menor número.*/
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        int n = teclado.nextInt();

        double numeroMaior = Integer.MIN_VALUE;
        double numeroMenor = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            System.out.println("Informe o " + i + "º número real");
            double nReal = teclado.nextDouble();
            
            if (nReal > numeroMaior) {
                numeroMaior = nReal;
            }
            if (nReal < numeroMenor) {
                numeroMenor = nReal;
            }
        }
        System.out.println("O maior valor é: " + numeroMaior);
        System.out.println("O menor valor é: " + numeroMenor);
        teclado.close();
    }
}
