package academy.devdojo.maratona.java;

public class aula06EstruturasDeRepeticao {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        while (count < 10) {
            System.out.println(++count);
        }
        do {
            System.out.println("Dentro do do-while");
        } while (count < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("For"+1);
        }
    }
}
