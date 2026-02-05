package arrays;

public class StringArrays {

    // creation du tableau de n element
    public static String[] crearArrayStr(int n){
        return new String[n];
    }

    // creation du tableau bidimentonal
    public static String[][] crearArrayintDid(int n, int m){
        return new String[n][m];
    }

    // Initialiser avec une valeur donnée
    public static void iniciArrayBid(String[] tab, String v){
        for (int i=0; i<tab.length; i++){
            tab[i] = v;
        }
    }
}
