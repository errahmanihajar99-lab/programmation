package input;

import java.util.Scanner;

/**
 * Cette classe fournit des méthodes utilitaires pour la saisie de données
 * sécurisée via la console.
 * * @author Hajar Errahmani
 * @version 1.0
 */
public class input {
    private static final Scanner scan = new Scanner(System.in);

    /**
     * Affiche un message et récupère un nombre entier saisi par l'utilisateur.
     * * @param missatge Le message d'invite à afficher à l'utilisateur.
     * @return L'entier saisi par l'utilisateur.
     */
    public static int introduirNumeroEnter(String missatge){
        System.out.println(missatge);
        int res = scan.nextInt();
        // Consomme le reste de la ligne pour éviter les problèmes de tampon (buffer)
        if (scan.hasNextLine()) {
            scan.nextLine();
        }
        return res;
    }

    /**
     * Demande à l'utilisateur de saisir un nombre et vérifie s'il se trouve
     * à l'intérieur d'un intervalle spécifique (non compris).
     * * @param min La borne minimale de l'intervalle.
     * @param max La borne maximale de l'intervalle.
     * @return true si le nombre est strictement entre min et max, false sinon.
     */
    public static boolean numeroRang(int min, int max){
        int n = introduirNumeroEnter("Entrodueix un numero:");
        return (n > min && n < max);
    }

    /**
     * Force la saisie d'un caractère unique. Recommence tant que l'entrée
     * n'est pas exactement un seul caractère.
     * * @param missatge Le message d'invite à afficher.
     * @return Le caractère unique saisi.
     */
    public static char introduirCaracter(String missatge){
        String s;
        do {
            System.out.println(missatge);
            s = scan.nextLine();
        } while (s.length() != 1);

        return s.charAt(0);
    }

    /**
     * Demande un caractère et vérifie s'il est présent dans une chaîne de référence.
     * * @param chaine La chaîne de caractères contenant les caractères autorisés.
     * @return true si le caractère saisi est présent dans la chaîne, false sinon.
     */
    public static boolean verificarCaracter(String chaine){
        char c = introduirCaracter("Introdueix un caracter per verificar:");
        return chaine.contains(String.valueOf(c));
    }
}