package arrays;
import java.util.Arrays;
import java.util.Random;


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

    // 6.Affichage des valeurs d'un tableau bidimensionnel
    public static void mostrarVArrayBiInt(int[][] tab){
        for (int[] ligne : tab){// chaque ligne dans le tableau
            for (int v : ligne){// chaque element de la ligne
                System.out.println(v+" ");
            }
        }
    }

    // 7.Inverser les elements du tableau
    public static void inversarElementsInt (int[] tab){
        for (int i=0; i< tab.length/2; i++){
            int x = tab[i];
            tab[i] = tab[tab.length-i-1];
            tab[tab.length-i-1] = x;
        }
    }

    // 8.Déplacer (Décalage vers la gauche)
    public static void deplacerInt(int[] tab){
        int x = tab[0];
        for (int i=0; i< tab.length; i++){
            if(i< tab.length-1){
                tab[i] = tab[i+1];
            }
            else {tab[i] = x;}
        }
    }

    // 9.mélanger un tableau
    // Pour mélanger un tableau en Java de manière vraiment aléatoire (équitable), on utilise l'algorithme de Fisher-Yates.
    public static void melangerInt (int[] tab){
        Random rand = new Random(); // Objet pour générer du hasard
        for (int i= tab.length-1; i>0; i--){
            // Choisir un index au hasard entre 0 et i
            int j = rand.nextInt(i+1);

            int x = tab[i];
            tab[i] = tab[j];
            tab[j] = x;
        }
    }
}
