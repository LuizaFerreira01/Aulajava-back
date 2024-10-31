

import java.util.Scanner;

public class QuartaClasse {
    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);

        System.out.println("Entre com a tabuada desejada: ");
        int tabuada = numero.nextInt();

        System.out.println("1 x " + tabuada + "=" + tabuada * 1);
        System.out.println("2 x " + tabuada + "=" + tabuada * 2);
        System.out.println("3 x " + tabuada + "=" + tabuada * 3);
        System.out.println("4 x " + tabuada + "=" + tabuada * 4);
        System.out.println("5 x " + tabuada + "=" + tabuada * 5);
        System.out.println("6 x " + tabuada + "=" + tabuada * 6);
        System.out.println("7 x " + tabuada + "=" + tabuada * 7);
        System.out.println("8 x " + tabuada + "=" + tabuada * 8);
        System.out.println("9 x " + tabuada + "=" + tabuada * 9);
        System.out.println("10 x " + tabuada + "=" + tabuada * 10);
    }
}
