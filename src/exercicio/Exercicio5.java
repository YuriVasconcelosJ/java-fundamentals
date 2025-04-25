package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        // Variable declaration
        double radius;
        double pi = 3.14159;
        double result; 

        System.out.println("Enter the raidus value ");
        radius = sc.nextDouble();

        result = (pi * (Math.pow(radius, 2.0)));

        System.out.printf("The result is: %f", result);

        sc.close();
    }
    
}
