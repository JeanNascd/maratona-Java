package academy.devdojo.maratona.java;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado.
        // condição valorParcela >= 10000

        double valorCarro = 50000;
        for (int parcela = 1; parcela < valorCarro / 1000; parcela++) {
            System.out.println("parcela "+parcela);
        }
        double valorTotal = 30000;
        for (int parcela = 0; parcela <= valorTotal ; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela >= 1000){
                System.out.println("Parcela "+ parcela+ "R$ "+valorParcela);
            }else{
                break;
            }
            System.out.println("Fora do if, mas dentro do for "+parcela);
        }
    }
}

