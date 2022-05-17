//*COMPLETOOOO!!!!!!!!
public class Uni5Exe02 {
    public static void main(String[] args) {
        int somaPares = 0;
        int somaImpares = 0;
        for (int numero = 1; numero <= 100; numero++) {
            if (numero % 2 == 0) {
                somaPares += numero;
            } else {
                somaImpares += numero;
            }
        }
        System.out.println("Soma Pares: " + somaPares);
        System.out.println("Soma Impares: " + somaImpares);
    }
}
