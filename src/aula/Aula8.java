package aula;

import java.util.Scanner;

public class Aula8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            sum += x;
        }
        System.out.println(sum);
        sc.close();
    }
}
