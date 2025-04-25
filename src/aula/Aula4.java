package aula;

public class Aula4 {
    public static void main(String[] args) {
        // Variables declaration 
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C = 3.0;

        // Sqrt

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);

        System.out.printf("The square root of %f is %f%n",x, A);
        System.out.printf("The square root of %f is %.0f%n",y, B);
        System.out.printf("The square root of 25 is %.0f%n", C);
    
        // Pow

        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);

        System.out.printf("The square root of %f is %.1f%n",x, A);
        System.out.printf("The square root of %f is %.1f%n",x, B);
        System.out.printf("The square root of %d is %.1f%n",5, C);

        // Abs

        A = Math.abs(y);
        B = Math.abs(z); 
        System.out.printf("Absolut Value: %.0f%n", A);
        System.out.printf("Absolut Value: of %.1f is %.0f", z, B);
        

    }
}
