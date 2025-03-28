package academy.devdojo.maratonajava.introducao.introducaoclasses.javacore.introducaoclasses.test;
import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Luiz";
        estudante.idade = 21;
        estudante.sexo = 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);
        
    }
}
