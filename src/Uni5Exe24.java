import java.util.Scanner;

/*
Os regulamentos de uma competição de pesca impõem um limite no peso total de pesca de um dia. 
    Descreva um algoritmo que leia o limite diário (em quilogramas) e então leia o peso (em gramas) de cada peixe e escreva o peso total da pesca obtido até aquele ponto. 
 Quando o limite diário for excedido escreva uma mensagem e encerre a execução do algoritmo. 
    Para prosseguir com a entrada de dados de pesos de cada peixe o algoritmo deve apresentar a seguinte mensagem: 
    “deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)?”.

*/
public class Uni5Exe24 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            char registro = 'S';
            double pesoTotal = 0;

            System.out.print("Limite diário de peso em quilos:\nKg ");
            double pesoMaximo = input.nextDouble();

            while (registro == 'S') {

                System.out.print("Peso do peixe:\nKg ");
                double peso = input.nextDouble();

                pesoTotal += peso;

                if (pesoTotal > pesoMaximo) {
                    System.out.print("Peso máximo excedido.");
                    return;
                } else {
                    System.out.println("Peso total da pesca obtido: " + pesoTotal + " Kg");
                    System.out.println("deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)?");
                    registro = input.next().toUpperCase().charAt(0);
                }
            
            }

            input.close();
        }

    }
}
