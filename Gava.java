
package gava;

import java.util.Scanner;

public class Gava {
    public static void generateFibonacci(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int a = 0, b = 1;
        System.out.print("Fibonacci Sequence: " + a);

        if (n > 1) {
            System.out.print(", " + b);
        }

        for (int i = 2; i < n; i++) {
            int nextNumber = a + b;
            System.out.print(", " + nextNumber);
            a = b;
            b = nextNumber;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the Fibonacci sequence: " );                
        int n = scanner.nextInt();
        generateFibonacci(n);
    }
}

