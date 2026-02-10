import java.util.Scanner;

public class TresEnRatlla {
    public static Scanner scan = new Scanner(System.in);
    public static char[][] joc = new char[3][3];


     static void main(String[] args) {
        // remplissage du tableau
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                joc[i][j] = '.';
            }
        }
        mostrarPlateu(joc); // afficher le tableau

        // declarer les variables
        int[] fc = new int[2]; //variable de la position
        int contador = 0;
        char torn= 'O'; // pour compter le nombre d essaie pour chaque joueure

        do {
            int fila;
            int colm;

            // déroulement du tour
            if (torn == 'X') {torn = 'O';}
            else {torn = 'X';}

            do {
                fc = demanarPosicio(torn);
                fila = fc[0];
                colm = fc[1];
                if (joc[fila][colm] != '.') {
                    System.out.println("Aquesta casella ja està ocupada. Tria'n una altra!");
                }
            }while (joc[fila][colm]!='.');

            joc[fila][colm] = torn;
            contador++;
            mostrarPlateu(joc);


        }while (!tres(torn) && contador<9);

        if (tres(torn)){
            System.out.println("En jugador "+ torn+" ha guaniat");
        }
        else {System.out.print(" No hi ha ganador");}
    }

    public static void mostrarPlateu(char[][] x) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
    }

    // demander la position
    public static int[] demanarPosicio(char jgd){
        int[] psc = new int[2];
        String resposta;
        do {
            System.out.print("Jugador "+jgd+" -Introdueix fila i columne exp: 12");
            resposta = scan.nextLine();
        }while (!resposta.matches("[1-3]{2}"));
        psc[0] = resposta.charAt(0)-'1';
        psc[1] = resposta.charAt(1)-'1';

        return psc;
    }

    // compreuver le jeux
    public static boolean tres(char jgd) {
        for (int i = 0; i < 3; i++) {
            // Vérification des colonnes (joc[0][i], [1][i], [2][i])
            if (joc[0][i] == jgd && joc[1][i] == jgd && joc[2][i] == jgd) return true;

            // Vérification des lignes (joc[i][0], [i][1], [i][2])
            if (joc[i][0] == jgd && joc[i][1] == jgd && joc[i][2] == jgd) return true;
        }

        // Vérification des deux diagonales (hors de la boucle)
        if (joc[0][0] == jgd && joc[1][1] == jgd && joc[2][2] == jgd) return true;
        if (joc[0][2] == jgd && joc[1][1] == jgd && joc[2][0] == jgd) return true;

        return false; // Si on arrive ici, personne n'a gagné
    }
}
