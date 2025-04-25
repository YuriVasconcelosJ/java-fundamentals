package aula;

import java.util.Scanner;

public class Aula3 {
    public static void main(String[] args) {
        // variables declaration
        int num;
        String s1, s2, s3;
        
        // Creating sc object
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.println("Input your name: ");
        String x = sc.nextLine();
        System.out.printf("You typed: %s", x);

        // Input Int
        System.out.println("Input your number: ");
        int y = sc.nextInt();
        System.out.printf("You typed: %d",y);
        
        // Input Double
        System.out.println("Input a double number: ");
        double z = sc.nextDouble();
        System.out.printf("You typeed %.2f%n", z);

        // Input char
        System.out.println("Input a char: ");
        char v = sc.next().charAt(0);
        System.out.printf("You typeed %c", v);

        System.out.println("Parte do buff");
        num = sc.nextInt();     // <-- aqui
        sc.nextLine();          // <-- aqui é necessário, mas pode confundir
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("You typed:");
        System.out.println(num);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();

    }
    
}

// Scanner
// import java.util.Scanner
// Scanner sc = new Scanner(System.in)
// sc.close()

// Cuidado com a questão de localidade o "." e "," 
// Para ler vários dados na mesm linha só precisa colocar uma seguida da outra
// x = sc.next();
// y = sc.nextInt();
// z = sc.nextDouble();

// Entrada:
// Yuri 30 4.5

// sc.nextLine() - Le ate a quebra de linha
// Quando usamos um comando de leitura diferene do nextLine(), devmos dar outra quebra e consumir o entere que ficou pendente