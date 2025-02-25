package academy.devdojo.maratona.java;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !
        if (isAutorizadoComprarBebida == false) {
            System.out.println("Pode beber bebida alcólica");
        }
        if(!isAutorizadoComprarBebida == false) {
            System.out.println("Não autorizado a comprar bebida alcólica");
        }
        boolean c = false;
        if(c == true){
            System.out.println("Dentro de algo que nunca deve ser feito");
        }
        System.out.println("Fora do if");
    }
}
