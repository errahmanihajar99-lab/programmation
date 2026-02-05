package arrays;

import java.util.Arrays;

public class StringArrays {

    // 1.creation du tableau de n element
    public static String[] crearArrayStr(int n){
        return new String[n];
    }

    // 2.creation du tableau bidimentonal
    public static String[][] crearArrayintDid(int n, int m){
        return new String[n][m];
    }

    // 3.Initialiser avec une valeur donnée
    public static void iniciArrayStr(String[] tab, String v){
        for (int i=0; i<tab.length; i++){
            tab[i] = v;
        }
    }

    // 4.Initialiser un array bidim avec une valeur donnée
    public static void iniciArrayBidStr(String[][] tab, String v){
        for (String[] ligne : tab) {
            Arrays.fill(ligne, v);
        }
    }

    // 5.Affichage des valeurs d'un tableau
    public static void mostrarVArrayStr(String[] tab){
        for (String j : tab) {
            System.out.println(j);
        }
    }
}
