package exercicio;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        int value1, value2, value3, value4;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first value: ");
        value1 = sc.nextInt();

        System.out.println("Enter the second value: ");
        value2 = sc.nextInt();

        System.out.println("Enter the third value: ");
        value3 = sc.nextInt();

        System.out.println("Enter the fourth value: ");
        value4 = sc.nextInt();

        System.out.println("Result: " + (value1 * value2 - value3 * value4));
    

        sc.close();
    }
    
}
