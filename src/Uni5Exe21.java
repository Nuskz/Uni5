/*Chico tem 1,50 metro e cresce 2 centímetros por ano, 
enquanto Zé tem 1,10 metros e cresce 3 centímetros por ano.

Construa um algoritmo que calcule e imprima quantos anos serão necessários para que Zé seja maior que Chico.
*/
public class Uni5Exe21 {
    public static void main(String[] args) {

        double ze = 1.1;
        double chico = 1.5;
        int ano = 0;

        while (ze < chico) {
            ano++;
            chico += 0.02;
            ze += 0.03;

        }
        System.out.println("Para que Zé passe Chico serão necessários: \n" + ano + " anos");
    }
}
