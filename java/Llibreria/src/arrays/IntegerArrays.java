package arrays;
import java.util.Scanner;

public class IntegerArrays {

    // creation du tableau de n element
    public static int[] crearArrayInt(int n){
        return new int[n];
    }

    // creation du tableau bidimentonal
    public static int[][] crearArrayintDid(int n, int m){
        return new int[n][m];
    }

    // Initialiser avec une valeur donnée
    public static void iniciArray(int[] tab, int v){
        for (int i=0; i<tab.length; i++){
            tab[i] = v;
        }
    }

}
