package exercicio;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        // Variable declaration 
        int x, y;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        x = sc.nextInt();
        System.out.println("Enter the second number: ");
        y = sc.nextInt();

        System.out.println("Sum: " + (x + y));

        sc.close();
    }
    
}
