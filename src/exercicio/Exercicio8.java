package exercicio;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Variable Declaration
        int code, code2, partNumbers, partNumbers2;
        float valueUnit, valueUnit2, result;

        System.out.println("Enter the code, part of numbers, value unit: ");
        code = sc.nextInt();
        partNumbers = sc.nextInt();
        valueUnit = sc.nextInt();
        code2 = sc.nextInt();
        partNumbers2 = sc.nextInt();
        valueUnit2 = sc.nextInt();

        float sum = ((partNumbers * valueUnit) + (partNumbers2 * valueUnit2));

        System.out.printf("Value pay: R$ %.2f", sum);
    }

}
