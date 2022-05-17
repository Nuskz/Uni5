//*COMPLETOOOO!!!!!!!!
public class Uni5Exe04 {
    public static void main(String[] args) {
        double numerador, denominador, auxiliar;
        float soma = 0;
        numerador = 3;
        denominador = 2;
        auxiliar = 4;

        for(int contador = 1; contador <= 20; contador++) {
            
            soma += (numerador / denominador);
            System.out.println(numerador + " / " + denominador + " = " + soma);
            
            numerador += 2;
            denominador += auxiliar;
            auxiliar += 2;
        }
        System.out.println("Soma " + soma);
    }
}
