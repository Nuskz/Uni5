import java.text.DecimalFormat;
import java.util.Scanner;

/*
 Um hotel cobra R$ 50,00 de diária por hóspede e mais uma taxa de serviços. A taxa de serviços é de:

R$ 7,50 por diária, caso o número de diárias seja menor que 15;
R$ 6,50 por diária, caso o número de diárias seja igual a 15;
R$ 5,00 por diária, caso o número de diárias seja maior que 15.
Descreva um algoritmo que apresente as seguintes opções ao recepcionista:

(1) encerrar a conta de um hóspede;
(2) verificar número de contas encerradas;
(3) sair.
Caso a opção escolhida seja a primeira, leia o nome e o número de diárias do hóspede e escreva o nome e total a ser pago. 
Caso a opção escolhida seja a segunda, informe o número de hóspedes que deixaram o hotel (número de contas encerradas). 
Caso a opção escolhida seja a terceira finalize a execução do algoritmo.
 */
public class Uni5Exe34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");

        String nome = "";
        int diarias = 0;
        int opcao = 0;
        int contas = 0;

        double totalPagar = 0;
        double valorDiarias = 0;
        do {
            System.out.println(
                    "(1) Encerrar a conta de um hóspede\n(2) Verificar número de contas encerradas\n(3) Sair.");
            opcao = input.nextInt();

            switch (opcao) {

                case 1:
                    contas++;
                    System.out.print("Informe o nome do(a) hóspede: ");
                    nome = input.next();

                    System.out.print("\nInforme quantos dias ele(a) passou: ");
                    diarias = input.nextInt();

                    if (diarias < 15) {
                        valorDiarias = 7.5;
                        totalPagar = valorDiarias * diarias;

                        System.out.println("Hóspede: " + nome + "\nValor a pagar: R$" + deci.format(totalPagar));

                    } else if (diarias == 15) {

                        valorDiarias = 6.5;
                        totalPagar = valorDiarias * diarias;
                        System.out.println("Hóspede: " + nome + "\nValor a pagar: R$" + deci.format(totalPagar));

                    } else {
                        valorDiarias = 5;
                        totalPagar = valorDiarias * diarias;
                        System.out.println("Hóspede: " + nome + "\nValor a pagar: R$" + deci.format(totalPagar));
                    }
                    break;

                case 2:
                    System.out.println("Contas encerradas: " + contas);
                    break;

                case 3:
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 3);

        input.close();
    }
}
