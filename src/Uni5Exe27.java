import java.text.DecimalFormat;
import java.util.Scanner;
/*
Uma fábrica resolveu, no mês de Abril, pagar seus funcionários um valor diário conforme as regras descritas abaixo. 

Escreva um programa para ler o dia do mês de abril que será calculado o valor diário. 
O programa deve validar a leitura do dia deforma a aceitar apenas valores válidos para o mês de Abril (1 a 30). 
Caso o dia seja inválido, escrever a mensagem "Dia inválido" e repetir a leitura até que seja válido. 
A seguir deve ser lido o total de peças produzidas pelo funcionário no turno da manhã e o total de peças produzidas no turno da tarde. 
Escrever o valor que o respectivo funcionário receberá no dia. Logo após exibir a mensagem "Novo funcionário (1.sim 2.não)?". 
Caso a resposta seja 1 o programa deve ser repetido solicitando novamente o dia do mês e a produção de peças do funcionário em cada turno, 
caso contrário deve ser encerrado.

Regras:

para a primeira quinzena do mês (1 a 15) o funcionário recebe R$ 0,80 por peça caso tenha produzido mais de 100 no dia (considerando manhã e tarde), 
desde que a produção em cada um dos turnos não seja inferior a 30. Caso contrário recebe R$ 0,50 por peça.
para a segunda quinzena do mês (16 a 30) o funcionário recebe R$ 0,40 por peça produzida no turno da manhã e R$ 0,30 por peça produzida no turno da tarde.
Considere que a produção em cada turno nunca será a mesma (não é necessário validar) Responda também:

qual dia ocorreu a maior produção;
em qual período o funcionário mais produz (manhã ou tarde e a quantidade produzida).
*/
public class Uni5Exe27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pagamento = 0;
        int novofuncionario = 0;
        int producaoMaior = Integer.MIN_VALUE;
        int producaoMaiorPorTurno = Integer.MIN_VALUE; 
        int producao = 0;
        int diaMaisProdutivo = 0;

        DecimalFormat deci = new DecimalFormat("0.00");

        while (novofuncionario != 2) {

            System.out.print("Dia do mês: ");
            int dia = input.nextInt();

            while (dia < 1 || dia > 30) {
                System.out.println("Dia inválido");
                System.out.print("Dia do mês: ");
                dia = input.nextInt();
            }

            System.out.print("Número de peças produzidas no período matutino(manhã): ");
            int pecasmanha = input.nextInt();

            System.out.print("Número de peças produzidas no período verspertino(tarde): ");
            int pecastarde = input.nextInt();

            producao = pecasmanha + pecastarde;

            if (dia >= 1 && dia <= 15) {
                if (pecasmanha < 30 || pecastarde < 30) {
                    pagamento = (pecasmanha + pecastarde) * 0.5;
                } else if (pecasmanha + pecastarde >= 100) {
                    pagamento = (pecasmanha + pecastarde) * 0.8;
                } else {
                    pagamento = (pecasmanha + pecastarde) * 0.5;
                }
            }
            if (dia > 15 && dia <= 30) {
                pagamento = (pecasmanha * 0.4) + (pecastarde * 0.3);
            }

            if (producao > producaoMaior) {
                producaoMaior = producao;
                diaMaisProdutivo = dia;
            }
            
            if (pecasmanha > pecastarde && pecasmanha > producaoMaiorPorTurno) {
                producaoMaiorPorTurno = pecasmanha;
                System.out.println("Produziu mais no período matutino: " + producaoMaiorPorTurno + " peças");
            } else {
                producaoMaiorPorTurno = pecastarde;
                System.out.println("Produziu mais no período vespertino: " + producaoMaiorPorTurno + " peças");
            }

            System.out.println("Valor recebido: R$" + deci.format(pagamento));

            System.out.print("Novo funcionário? \n(1) Sim\n(2) Não ");
            novofuncionario = input.nextInt();
        }
        System.out.println("Dia " + diaMaisProdutivo + " foi o mais produtivo");
        input.close();
    }
}
