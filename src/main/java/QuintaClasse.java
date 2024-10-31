
import java.util.Scanner;

public class QuintaClasse {
    public static void main(String[] args) {

        Scanner notas = new Scanner(System.in);

        float nota1, nota2, nota3, nota4;

        System.out.println("Digite a primeira nota:");
        nota1 = notas.nextFloat();
        System.out.println("Digite a segunda nota:");
        nota2 = notas.nextFloat();
        System.out.println("Digite a terceira nota:");
        nota3 = notas.nextFloat();
        System.out.println("Digite a quarta nota:");
        nota4 = notas.nextFloat();

        float meadiana = (nota1 + nota2 + nota3 + nota4) /4;


        System.out.println("A mediana da sua nota é:" + meadiana);

        if (meadiana>=6){
            System.out.println("O aluno está aprovado!😁");

        }
        else if (meadiana>5){
            System.out.println("O aluno está de recuperação!😥");
        }
        else {
            System.out.println("O aluno está reprovado!😭");
        }
        //o sistema entrega 4 notas do usuario e depois entrega a média
    }
}
