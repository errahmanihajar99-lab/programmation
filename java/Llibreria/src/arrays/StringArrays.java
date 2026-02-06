package arrays;

import java.util.Arrays;
import java.util.Random;


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

    // 6.Affichage des valeurs d'un tableau bidimensionnel
    public static void mostrarVArrayBiStr(String[][] tab){
        for (String[] ligne : tab){
            for (String v : ligne){
                System.out.println(v +" ");
            }
        }
    }

    // 7.Inverser les elements du tableau
    public static void inversarElementsStr (String[] tab){
        for (int i=0; i< tab.length/2; i++){
            String x = tab[i];
            tab[i] = tab[tab.length-i-1];
            tab[tab.length-i-1] = x;
        }
    }

    // 8.Déplacer (Décalage vers la gauche)
    public static void deplacerStr(String[] tab){
        String x = tab[0];
        for (int i=0; i< tab.length; i++){
            if(i< tab.length-1){
                tab[i] = tab[i+1];
            }
            else {tab[i] = x;}
        }
    }

    // 9.mélanger un tableau
    // Pour mélanger un tableau en Java de manière vraiment aléatoire (équitable), on utilise l'algorithme de Fisher-Yates.
    public static void melangerInt (String[] tab){
        Random rand = new Random(); // Objet pour générer du hasard
        for (int i= tab.length-1; i>0; i--){
            // Choisir un index au hasard entre 0 et i
            int j = rand.nextInt(i+1);

            String x = tab[i];
            tab[i] = tab[j];
            tab[j] = x;
        }
    }
}
