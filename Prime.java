import java.util.Scanner;

public class Prime {

    // Non-static method to check if a number is prime
    public void checkPrime(int num) {
        int flag = 0;

        if (num > 1) {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                System.out.println(num + " is a Prime Number.");
            } else {
                System.out.println(num + " is NOT a Prime Number.");
            }
        } else {
            System.out.println(num + " is NOT a Prime Number.");
        }
    }

    // Main method (static)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        Prime obj = new Prime();  // Create an instance of the Main class
        obj.checkPrime(num);  // Call the non-static checkPrime method using the object
    }
}