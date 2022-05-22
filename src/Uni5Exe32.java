import java.util.Scanner;

/*
Escreva um programa que imprime um calendário para um determinado mês. 
O calendário deve conter cada dia do mês e o dia da semana correspondente. 
    A entrada consiste de um inteiro especificando em que dia da semana cai 
o primeiro dia do mês (1=Domingo, 2=Segunda,...,7=Sábado) 
e um inteiro especificando o número de dias que o mês possui.
*/
public class Uni5Exe32ter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o dia que começa o mês: (1-domingo, 2-terça...7-sábado) ");
        int comecoMes = input.nextInt();
        System.out.print("\nQuantos dias o mês tem? ");
        int diasMes = input.nextInt();

        int calendario[][] = new int[5][7];

        for (int i = 1; i < comecoMes; i++) {
            System.out.print("  ");
        }
        for (int j = 0; j < 5; j++) {
            for (int k = 0; k < 7; k++) {

                if (comecoMes <= diasMes) {
                    if (j == 0 && k == 0) {
                        calendario[0][comecoMes] = 01;
                        System.out.print(calendario[0][comecoMes] + " ");
                    }
                    System.out.print(comecoMes + " ");
                    comecoMes++;
                }

            }
            System.out.println();
        }

        input.close();

    }
}
