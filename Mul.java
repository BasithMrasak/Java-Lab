import java.util.Scanner;

public class Mul {
    
    
    public void printMultiplicationTable(int n) {
        for (int i = n; i == n; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "*" + j + "=" + (i * j)); 
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N?: ");
        int n = sc.nextInt();
        sc.close();
        
        
        Mul obj1 = new Mul();
        obj1.printMultiplicationTable(n);  
    }
}