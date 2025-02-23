package academy.devdojo.maratona.java;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !
        if (isAutorizadoComprarBebida) {
            System.out.println("Pode beber bebida alcólica");
        }
        if(!isAutorizadoComprarBebida == false) {
            System.out.println("Não autorizado a comprar bebida alcólica");
        }

        System.out.println("Fora do if");
    }
}
