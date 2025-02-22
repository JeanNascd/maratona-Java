package academy.devdojo.maratona.java;

import java.sql.SQLOutput;

public class Aula04Operadores {
    public static void main(String[] args) {
        int numero01 = 10;
        int numero02 = 02;
        double resultado = numero01 / (double) numero02;
        System.out.println(resultado);

        // %
        int resto = 21 % 2;
        System.out.println(resto);

        // < > <= >= == !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte " +isDezMaiorQueVinte);
        System.out.println("isDezMaiorQueVinte " +isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " +isDezIgualVinte);
        System.out.println("isDezIgualDez " +isDezIgualDez);
        System.out.println("IsDezDiferenteDez "+isDezDiferenteDez);

        // && (AND) || (OR)
        int idade = 29;
        float salario = 3500F;
        boolean isDentrodaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaleiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentrodaLeiMaiorQueTrinta "+isDentrodaLeiMaiorQueTrinta);
        System.out.println("isDentroDaleiMenorQueTrinta "+isDentroDaleiMenorQueTrinta);
    }
}
