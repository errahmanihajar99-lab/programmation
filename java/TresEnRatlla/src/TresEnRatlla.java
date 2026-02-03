import java.util.Scanner;

public class TresEnRatlla {
    public static Scanner scan = new Scanner(System.in);
    public static char[][] joc = new char[3][3];


    public static void main(String[] args) {
        // remplissage du tableau
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                joc[i][j] = '.';
            }
        }
        mostrarPlateu(joc); // afficher le tableau

        // declarer les variables
        int[] fc = new int[2]; //variable de la position
        char torn= 'O';

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






        }while ();
    }

    public static void mostrarPlateu(char[][] x) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
    }

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

}
