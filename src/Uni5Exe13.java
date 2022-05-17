import java.util.Scanner;

public class Uni5Exe13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o número total de reabastecimentos: ");
        int nRbastecimento = teclado.nextInt();

        System.out.println("Digite o valor do odômetro com o tanque cheio: ");
        int kmInicial = teclado.nextInt();

        int kmDiferenca = 0;
        for (int quantidadeAbastecimentos = 0; quantidadeAbastecimentos < nRbastecimento; quantidadeAbastecimentos++) {


            System.out.print("Digite o valor do odômetro atual: ");
            int odometro = teclado.nextInt();
            System.out.println("Digite a quantidade em L de combustível: ");
            float quantidadeCombustivel = teclado.nextFloat();

            if (quantidadeAbastecimentos == 0) {
                kmDiferenca = kmInicial - odometro;
                kmInicial = odometro;
            } else {
                odometro -=
            }
        }
        teclado.close();
    }
}
