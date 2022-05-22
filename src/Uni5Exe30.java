import java.util.Scanner;

/*
Implemente o problema da mochila. 
Tendo-se uma seescentequência decr de números inteiros positivos que inicia em N, com decremento inteiro positivo K, 
deseja-se empacotá-los em uma mochila com tamanho M, de forma que se coloque dentro dela preferencialmente os maiores valores, 
até que ela esteja cheia. N e K são inteiros e devem ser definidos pelo usuário. Faça um algoritmo que imprima:

os elementos a serem colocados na mochila;
os elementos que entraram na mochila;
os que ficaram fora da mochila;
qual é a soma dos elementos que entraram na mochila;
qual a soma dos elementos que não entraram na mochila.

*/
public class Uni5Exe30 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o maior elemento: Kg ");
        int n = input.nextInt();

        System.out.print("\nInforme o decremento: Kg");
        int k = input.nextInt();

        System.out.print("\nInforme a capacidade da mochila: Kg");
        int m = input.nextInt();

        double dentro = 0;
        double fora = 0;
        while (n - k >= 0) {
            if (n <= m) {
                m -= n;
                dentro += n;
            } else {
                fora += n;
            }
            n -= k;
        }

        System.out.println("Soma dos elementos que entram: " + dentro);
        System.out.println("Soma dos elementos de fora: " + fora);

        input.close();
    }
}
