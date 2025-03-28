package academy.devdojo.maratonajava.introducaoclasses.introducao;

public class Desafio01 {
    public static void main(String[] args) {
        int numero = 17;
        boolean primo = true;

        if (numero <= 1) {
            primo = false;
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo) {
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo");
        }
    }
}
