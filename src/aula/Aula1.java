package aula;

import java.util.Locale;

public class Aula1 {
    public static void main(String[] args) {
                //Alterando localização do java
        Locale.setDefault(Locale.US);
        // Declaração das variáveis
        int y = 32;
        double x = 10.35784;

        System.out.println("Hello, World!");
        System.out.println("Bom Dia!");
        // Print da variável
        System.out.println(y);

        // Formatando uma saída de variável
        // Apenas duas casas decimais
        System.out.printf("%.2f%n",x);
        // Apenas 4 casas decimais 
        System.out.printf("%.4f%n", x);

        //Concatenando elementos:
        System.out.println("Resultado = " + x + " Metros");
        // Formatação utilizando o %.2f
        System.out.printf("Resultado = %.2f Metros", x);
        
    }

}

// print e println - um quebra linha e o outro não
// O printf por parão pega a localidade do br


// %f = ponto flutuante
// %d = inteiro
// %s = strings
// %n = quebra de linha