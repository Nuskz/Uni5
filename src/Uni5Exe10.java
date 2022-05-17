
/*O número 3025 possui a seguinte característica:

30 + 25 == 55 -> 55^2 == 3025

Escreva um programa que pesquise e imprima os 10 primeiros números naturais que apresentam tal propriedade. Outros exemplos:
20 + 25 = 45 -> 45^2 = 2025
98 + 01 = 99 -> 99^2 = 9801
*/
public class Uni5Exe10 {
    public static void main(String[] args) {
        int soma = 0;
        int potencia = 0;
        String termoStr1, termoStr2;
        int cont = 0;

        for (int ter1 = 0; ter1 <= 10000; ter1++) {
            for (int ter2 = 0; ter2 <= 10000; ter2++) {
                soma = ter1 + ter2;
                potencia = soma * soma; 
                termoStr1 = potencia + "";
                termoStr2 = ter1 + "" + ter2;
                
                if (termoStr1.equals(termoStr2)) {
                    cont++;
                    System.out.println("[" + cont + "] " + ter1 + " + " + ter2 + " = " + soma + " -> " + potencia);
                    if (cont >= 10) {
                        break;
                    }
                }

            }
            if (cont >= 10) {
                break;
            }
        }
        System.out.println("----");
    }
}
