import java.util.Scanner;

public class Uni5Exe09 {
    /*
     * Uma turma tem n alunos. Dado n, o nome e idade de cada aluno descreva um
     * algoritmo que:
     * escreva os nomes dos alunos que tem 18 anos;
     * escreva a quantidade de alunos que tem idade acima de 20 anos.
<<<<<<< HEAD
     * COMPLETOO!!!!!!!!!!!!!!!!
=======
     *COMPLETOOOO!!!!!!!!
>>>>>>> 1de8348d01c6ef8f2aeeb710c4af5347bad37119
     */
     
     public static void main(String[] args) {
         
         Scanner teclado = new Scanner(System.in);
         
        System.out.println("Escreva a quantidade de alunos: ");
        int quantidade = teclado.nextInt();

        String alunos = "";
        int idade = 0;
        int alunos20 = 0;
        String aluno18 = "Alunos(as) com 18 anos:\n";
        
        for (int i = 1; i <= quantidade; i++) {
            
            System.out.println("Escreva o nome do " + i + "° aluno(a)");
            alunos = teclado.next();
            System.out.println("Escreva a idade dele(a): ");
            idade = teclado.nextInt();
            
            if (idade > 20) {
                alunos20++;
                
            } else if (idade == 18) {
                aluno18 = aluno18 + alunos + "\n";
                
            }
            
        }
        System.out.print(aluno18);
        System.out.print(alunos20 + " alunos que tem mais de 20 anos");
        
        teclado.close();
        
    }
    
}
