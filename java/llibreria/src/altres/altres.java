package altres;
import java.util.Random;

/**
 * Classe utilitària per a la generació de valors aleatoris.
 * Forma part de la biblioteca de gestió de dades.
 * * @author Hajar Errahmani
 * @version 1.0
 */

public class altres {
    private static final Random rand = new Random();

    /**
     * Genera un número enter aleatori dins d'un rang específic.
     * * @param min El valor mínim (inclòs).
     * @param max El valor màxim (inclòs).
     * @return Un número enter aleatori entre min i max.
     */
    public static int generarIntAleatori(int min, int max) {
        // nextInt(n) genera de 0 a n-1, per això ajustem el rang
        return rand.nextInt((max - min) + 1) + min;
    }

    /**
     * Genera un caràcter aleatori situat entre dos caràcters donats.
     * Útil per generar lletres aleatòries (ex: entre 'a' i 'z').
     * * @param inici El caràcter inicial del rang.
     * @param fi El caràcter final del rang.
     * @return Un caràcter aleatori entre inici i fi.
     */
    public static char generarCharAleatori(char inici, char fi) {
        // Els caràcters es poden tractar com a enters (codi ASCII/Unicode)
        int min = (int) inici;
        int max = (int) fi;
        int aleatori = generarIntAleatori(min, max);
        return (char) aleatori;
    }
}
