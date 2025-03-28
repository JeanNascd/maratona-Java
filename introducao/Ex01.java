package academy.devdojo.maratonajava.introducaoclasses.introducao;

public class Ex01 {
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double taxa;
        double valorImposto = 0;
        if(salarioAnual <= 34712){
            taxa = 9.70 / 100;
        }else if (salarioAnual <= 68508){
            taxa = 37.35 / 100;
        }
        else{
            taxa = 49.50 / 100;
        }
        valorImposto = salarioAnual * taxa;
        System.out.println(valorImposto);
        System.out.println(taxa);
    }
}
