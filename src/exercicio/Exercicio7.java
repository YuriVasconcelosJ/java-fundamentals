package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); 
        // Variable Declaration
        int employeerNumber, hoursWorked;
        double salary;

        System.out.println("Enter the employeer number: ");
        employeerNumber = sc.nextInt();

        System.out.println("Enter the hours worked: ");
        hoursWorked = sc.nextInt();

        System.out.println("Enter the salary for hours: ");
        salary = sc.nextDouble();

        double result = salary * hoursWorked;

        System.out.printf("Number: %d%n", employeerNumber);
        System.out.printf("SALARY = U$ %.2f", result);

        sc.close();
    }
    
}
