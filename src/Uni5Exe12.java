import java.util.Scanner;

/*Escreva um programa que leia um número inteiro positivo n e em seguida imprima n linhas do chamado Triangulo de Floyd:
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
16 17 18 19 20 21
Triangulo de Floyd
COMPLETO*/
public class Uni5Exe12 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Quantas linhas você deseja que o triângulo tenha? ");
        int linhaTri = teclado.nextInt();

        int num = 1;
        String quebraTri = " ";
        for (int i = 1; i <= linhaTri; i++) {
             for (int t = 1; t <= i; t++) {
                System.out.print(num + quebraTri);
                num += 1;
             }
             System.out.println();
        }
        teclado.close();
    }
}
