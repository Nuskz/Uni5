import java.util.Scanner;

/*
Implemente o problema da mochila. 
Tendo-se uma sequência decrescente de números inteiros positivos que inicia em N, com decremento inteiro positivo K, 
deseja-se empacotá-los em uma mochila com tamanho M, de forma que se coloque dentro dela preferencialmente os maiores valores, 
até que ela esteja cheia. N e K são inteiros e devem ser definidos pelo usuário. Faça um algoritmo que imprima:

os elementos a serem colocados na mochila;
os elementos que entraram na mochila;
os que ficaram fora da mochila;
qual é a soma dos elementos que entraram na mochila;
qual a soma dos elementos que não entraram na mochila.

*/
public class Uni5Exe30ter {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a quantidade de elementos: ");
        int quantidadeTotal = input.nextInt();

        System.out.print("\nInforme a capacidade da mochila: ");
        int capacidade = input.nextInt();

        double sobra = 0;
        double quantidade = 0;
        if (quantidade > capacidade) {
            sobra = quantidadeTotal - capacidade;
            quantidade = quantidadeTotal - sobra;
        }

        while (quantidade != 0) {
            quantidade--;
            

        }




        
        input.close();
    }
}
