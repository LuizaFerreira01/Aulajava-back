import java.util.Scanner;

public class SextaClasse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float peso, altura;

        System.out.println("Digite seu peso:");
        peso = scanner.nextFloat();
        System.out.println("Digite sua altura:");
        altura = scanner.nextFloat();

        float imc = peso / (altura*altura);

        if (imc <=18.5) {

            System.out.println("Você está abaixo do peso!");

        }
        else if ((imc <=18.6) && (imc <=24.9)){

            System.out.println("Você está no peso ideal ");

        }


    }
}