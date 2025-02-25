package academy.devdojo.maratona.java;

public class Ex01 {
    public static void main(String[] args) {
        double salarioAnual = 50.000F;
        double taxa;
        if(salarioAnual <= 34.712){
            taxa = 9.70;
        }else if (salarioAnual <= 68.508){
            taxa = 37.35;
        }
        else{
            taxa = 49.50;
        }
        System.out.println(taxa);
    }
}
