package academy.devdojo.maratonajava.introducaoclasses.introducao;

public class Desafio2 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3};
        int multiplicador = 2;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Os números inseridos foram " + numeros[i]);
            numeros[i] = numeros[i] * multiplicador;
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Os números inseridos foram multiplicados por 2 " + numeros[i]);
        }
    }
}
