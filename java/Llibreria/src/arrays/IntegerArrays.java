package arrays;
import java.util.Arrays;


public class IntegerArrays {

    // 1.creation du tableau de n element
    public static int[] crearArrayInt(int n){
        return new int[n];
    }

    // 2.creation du tableau bidimentonal
    public static int[][] crearArrayintDid(int n, int m){
        return new int[n][m];
    }

    // 3.Initialiser avec une valeur donnée
    public static void iniciArrayInt(int[] tab, int v){
        for (int i=0; i<tab.length; i++){
            tab[i] = v;
        }
    }

    // 4.Initialiser un array bidim avec une valeur donnée
    public static void iniciArrayBidInt(int[][] tab, int v){
        for (int[] ints : tab) {
            Arrays.fill(ints, v);
        }
    }

    // 5.Affichage des valeurs d'un tableau
    public static void mostrarVArrayInt(int[] tab){
        for (int j : tab) {
            System.out.println(j);
        }
    }

}
