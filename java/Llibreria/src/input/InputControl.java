package input;

import java.util.Scanner;

public class InputControl {
    private static final Scanner scan = new Scanner(System.in);

    //1. introduir un entier(missatge  est un paramettre qui permet d'ecrire n'importe quelle message
    public static int introduirNumeroEnter(String missatge){
        System.out.println(missatge);
        int res = scan.nextInt();
        scan.hasNextLine();// pour viter le tampon pour eviter les bugs futurs
        return res;
    }

    //2.Introduire un numero verifiant qu'il est entre deux valeurs
    public static boolean numeroRang(int min, int max){
        int n = introduirNumeroEnter("entrodueix un numero");
        return (n>min && n<max);
    }
}
