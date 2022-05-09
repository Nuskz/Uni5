public class Uni5Exe10 {
    public static void main(String[] args) {
        for (int i = 1000; i < 9999; i++) {
            
            int parte1 = (i/100);
            int parte2 = (i %100);

            int soma = parte1 + parte2;
            int potencia = (int) Math.pow(soma, 2);
            
            if (potencia == i) {
                System.out.println(i);
            }
        }
    }
}
