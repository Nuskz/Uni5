import java.util.Scanner;
//COMPLETA!!!
public class Uni5Exe15 {

    public static void main(String[] args) {

        // Scanner
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o nome do aluno:");
        String nome = teclado.next();

        while (!nome.trim().equalsIgnoreCase("Fim")) {
            System.out.println("Informe a 1° nota:");
            float nota1 = teclado.nextFloat();
            System.out.println("Informe a 2° nota:");
            float nota2 = teclado.nextFloat();

            float media = (nota1 + nota2) / 2;
            System.out.println("A média é: " + media);

            System.out.println("Digite o nome do aluno: ");
            nome = teclado.next();
        }

        teclado.close();
    }
}