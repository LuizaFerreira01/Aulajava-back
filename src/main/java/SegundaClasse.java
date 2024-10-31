
import java.util.Scanner;

public class SegundaClasse {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        System.out.println("Entre com o seu nome: ");
        String nome = dados.nextLine();

        System.out.println("Entre com a sua idade: ");
        int idade = dados.nextInt();


        System.out.println("Entre com o seu peso: ");
        double peso = dados.nextDouble();

        System.out.println("Entre com a su altura: ");
        double altura = dados.nextDouble();


        System.out.println("O seu nome é: " + nome);
        System.out.println("A sua iade é: " + idade);
        System.out.println("O seu peso é: " + peso);
        System.out.println("A sua altura é: " + altura);

    }
}
