import java.util.Scanner;
/*Um motorista acaba de voltar de um feriado prolongado. 
Antes de sair de viagem e imediatamente após retornar, o motorista encheu o tanque do veículo e registrou as medidas do odômetro. 
Em cada parada feita durante a viagem, foi registrado o valor do odômetro e a 
quantidade de combustível comprado para reabastecer o veículo (suponha que o tanque foi enchido a cada parada). 
Descreva um algoritmo que leia o número total de reabastecimentos feitos e os dados registrados relativos à compra de combustível. 

Calcule e escreva:

a quilometragem obtida por litro de combustível em cada parada;
a quilometragem média obtida por litro de combustível em toda a viagem.*/

public class Uni5Exe13ter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número total de reabastecimentos: ");
        int nRbastecimento = input.nextInt();

        System.out.println("Digite o valor do odômetro com o tanque cheio: ");
        int kmInicial = input.nextInt();

        int kmDiferenca = 0;
        float soma = 0;
        for (int quantidadeAbastecimentos = 0; quantidadeAbastecimentos < nRbastecimento; quantidadeAbastecimentos++) {
            System.out.print("Digite o valor do odômetro atual: ");
            int odometro = input.nextInt();
            System.out.println("Digite a quantidade em L de combustível: ");
            float quantidadeCombustivel = input.nextFloat();

            kmDiferenca = odometro - kmInicial;
            kmInicial = odometro;

            float kmPorLitro = (kmDiferenca / quantidadeCombustivel);
            System.out.println("A quilometragem por litro de combustível na parada " +
                    quantidadeAbastecimentos + "  é " + kmPorLitro + " Km");

            soma += kmPorLitro;

        }
        System.out.println("A quilometragem média obtida por litro de combustível em toda a viagem é " + 
            (soma / nRbastecimento) + " Km" );
        
            input.close();
    }
}
