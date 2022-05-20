import java.util.Scanner;

/*Dado um determinado grupo de pessoas, 
descreva um algoritmo que a partir da altura e do sexo (sexo = 'M' ou sexo = 'm' para masculino e sexo = 'F' e sexo = 'f' para feminino) de cada pessoa 
informe a média da altura das mulheres e a média de altura do grupo. 
A leitura deve ser finalizada ao digitar 0 para a altura.
COMPLETOOOO*/
public class Uni5Exe16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe a altura em metros:");
        double altura = input.nextDouble();

        int contMasc = 0;
        int contFemi = 0;
        double alturaMasc = 0;
        double alturaFemi = 0;
        double mediaMasc = 0;
        double mediaFemi = 0;

        while (altura != 0) {

            System.out.println("Informe o Sexo:\n(M)asculino\n(F)eminino");
            char sexo = input.next().toUpperCase().charAt(0);

            switch (sexo) {
                case 'M':
                    contMasc++;
                    alturaMasc += altura;

                    break;

                case 'F':
                    contFemi++;
                    alturaFemi += altura;

                    break;

                default:
                    System.out.println("Opção inválida!");

            }
            System.out.println("Informe a altura em metros:");
            altura = input.nextDouble();
        }

        if (contMasc > 0) {
            mediaMasc = alturaMasc / contMasc;

        }
        if (contFemi > 0) {
            mediaFemi = alturaFemi / contFemi;
        }
        System.out.println("Média da altura do grupo masculino: " + mediaMasc + " m");
        System.out.println("Média da altura do grupo feminino: " + mediaFemi + " m");

        input.close();

    }
}
