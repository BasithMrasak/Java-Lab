import java.util.Scanner;

class SharedResource {
    private boolean isFactorialDone = false;

    public synchronized void printFactorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial: " + fact);
        isFactorialDone = true;
        notify();  
    }

    public synchronized void printReverse(int num) {
        while (!isFactorialDone) {
            try {
                wait();  
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int reverse = 0;
        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        System.out.println("Reversed: " + reverse);
    }
}

class FactorialThread extends Thread {
    private int num;
    private SharedResource resource;

    public FactorialThread(int num, SharedResource resource) {
        this.num = num;
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.printFactorial(num);
    }
}

class ReverseThread extends Thread {
    private int num;
    private SharedResource resource;

    public ReverseThread(int num, SharedResource resource) {
        this.num = num;
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.printReverse(num);
    }
}

public class Mainconcur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        SharedResource resource = new SharedResource();

        FactorialThread factorialThread = new FactorialThread(num, resource);
        ReverseThread reverseThread = new ReverseThread(num, resource);

        factorialThread.start();
        reverseThread.start();
    }
}