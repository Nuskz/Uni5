import java.text.DecimalFormat;
import java.util.Scanner;

/*
    Uma grande loja de departamentos paga aos vendedores um salário com base nas vendas efetuadas durante o mês, 
que é igual a 30% de comissão sobre o preço de cada produto vendido. 
Cada vendedor, em um determinado mês, vende n produtos, onde, para cada produto tem-se o preço unitário e a quantidade vendida. 
O departamento de pessoal deseja obter um relatório com: nome, total de vendas (em R$) e salário de cada vendedor. 
    Descreva um algoritmo que gere o relatório desejado. Para prosseguir com a entrada de dados o algoritmo deve apresentar a seguinte mensagem: 
“deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?”. 
O número de produtos (n) de cada vendedor deve ser informado. 
*/
public class Uni5Exe23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char registro = 'S';

        DecimalFormat deci = new DecimalFormat("0.00");

        while (registro == 'S') {
            
            System.out.print("Informe o nome do vendedor: ");
            String nome = input.next();
            System.out.print("Número de produtos vendidos: ");
            int vendidos = input.nextInt();
            System.out.print("Valor unitário dos produtos: ");
            double valor = input.nextDouble();

            double totalVendas = vendidos * valor;

            System.out.println(nome + "\nTotal de vendas: R$" + deci.format(totalVendas) + "\nSalário: R$" + deci.format((totalVendas * 0.3)));

            System.out.println("Deseja registrar os dados de mais um vendedor? (S/N)");
            registro = input.next().toUpperCase().charAt(0);
        }
        input.close();
    }    
}
