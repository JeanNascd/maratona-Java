package academy.devdojo.maratonajava.introducaoclasses.introducao;

public class Ex03 {
    public static void main(String[] args) {
        //Imprima números pares de 1 até 1mm

        for (int numero = 0; numero <= 1000000; numero++) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }
    }
}
