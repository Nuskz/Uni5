import java.util.Scanner;

public class app {
    
    
    public static void main(String[] args) {
    
    
        Scanner sc = new Scanner(System.in);
        int num ;
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
    
    
            System.out.print(i + "=");
            num = i ;
            for (int j = 2; j <= i/2; j++) {
    
    
                while (num % j == 0) {
    
    
                    num = num / j;
                    System.out.print(j);
                    if (num != 1)
                        System.out.print("*");
                }
            }
            if (num==i){
    
    
                System.out.print(i);
            }
            System.out.println();
        }
        sc.close();
    }
}