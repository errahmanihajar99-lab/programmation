package input;

import java.util.Scanner;

public class InputControl {
    private static final Scanner scan = new Scanner(System.in);

    // introduir un entier(missatge  est un paramettre qui permet d'ecrire n'importe quelle message
    public static int introduirNumeroEnter(String missatge){
        System.out.println(missatge);
        int res = scan.nextInt();
        scan.hasNextLine();// pour viter le tampon pour eviter les bugs futurs
        return res;
    }
}
