import java.util.Scanner;

/*
Dado um número inteiro positivo, determine a sua decomposição em fatores primos. A saída do programa deve ser semelhante ao exemplo abaixo:

número	decomposição: 

180   =     2
90    =     2
45    =     3
15    =     3
5     =     5
1        
*/
public class Uni5Exe31 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o número (inteiro): ");
        int num = input.nextInt();

        int decom = 2;

        while (num > 1) {
            while (num % decom == 0) {
                num /= decom;
                System.out.println("Decomposição: " + decom);

            }
            decom++;

        }

        input.close();
    }
}
