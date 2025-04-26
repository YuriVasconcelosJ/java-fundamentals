package aula;

import java.util.Scanner;

public class Aula7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int soma = 0;

        while (x != 0) {
            soma += x;
            x = sc.nextInt();
        }
        System.out.printf("The result of the sum is: %d%n", soma);

        sc.close();
    }
}
// Realiza uma certa operação enquanto a codição for aceira
