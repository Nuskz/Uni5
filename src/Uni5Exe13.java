import java.util.Scanner;
/*Um motorista acaba de voltar de um feriado prolongado. 
Antes de sair de viagem e imediatamente após retornar, o motorista encheu o tanque do veículo e registrou as medidas do odômetro. 
Em cada parada feita durante a viagem, foi registrado o valor do odômetro e a 
quantidade de combustível comprado para reabastecer o veículo (suponha que o tanque foi enchido a cada parada). 
Descreva um algoritmo que leia o número total de reabastecimentos feitos e os dados registrados relativos à compra de combustível. 

Calcule e escreva:

a quilometragem obtida por litro de combustível em cada parada;
a quilometragem média obtida por litro de combustível em toda a viagem.*/

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
                
            }
        }
        teclado.close();
    }
}
