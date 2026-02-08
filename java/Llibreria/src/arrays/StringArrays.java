package arrays;

import java.util.Arrays;
import java.util.Random;
/**
 * Cette classe contient des outils pour manipuler des tableaux String.
 * Elle fait partie de la bibliothèque de gestion de données.
 * * @author Hajar Errahmani
 * @version 1.0
 */

public class StringArrays {

    /**
     * Creation d'un tableau
     * * @param n la longueur du tableau.
     * @return  un tableau d entier de la longueur n.
     */    public static String[] crearArrayStr(int n){
        return new String[n];
    }

    /**
     * creer un tableau bidimentional
     * @param n nombre des lignes.
     * @param m nombre des colones
     * @return un tableau bidementional
     */    public static String[][] crearArrayintDid(int n, int m){
        return new String[n][m];
    }

    /**
     * remplire un tableau avec une valeur v
     * @param tab tableau a remplire
     * @param v la valeur
     */    public static void iniciArrayStr(String[] tab, String v){
        for (int i=0; i<tab.length; i++){
            tab[i] = v;
        }
    }

    /**
     * remplire yn tableau bidi
     * @param tab le tableau a remplire
     * @param v la valeur
     */
    public static void iniciArrayBidStr(String[][] tab, String v){
        for (String[] ligne : tab) {
            Arrays.fill(ligne, v);
        }
    }

    /**
     * affichage des valeurs
     * @param tab le tableau a afficher
     */    public static void mostrarVArrayStr(String[] tab){
        for (String j : tab) {
            System.out.println(j);
        }
    }

    /**
     * afficher un tableau bid
     * @param tab le tableau a afficher
     */    public static void mostrarVArrayBiStr(String[][] tab){
        for (String[] ligne : tab){
            for (String v : ligne){
                System.out.println(v +" ");
            }
        }
    }

    /**
     * Inverser un tableau
     * @param tab le tableau a inverser
     */    public static void inversarElementsStr (String[] tab){
        for (int i=0; i< tab.length/2; i++){
            String x = tab[i];
            tab[i] = tab[tab.length-i-1];
            tab[tab.length-i-1] = x;
        }
    }

    /**
     * deplacer les elements
     * @param tab le tableau des element a deplacer
     */    public static void deplacerStr(String[] tab){
        String x = tab[0];
        for (int i=0; i< tab.length; i++){
            if(i< tab.length-1){
                tab[i] = tab[i+1];
            }
            else {tab[i] = x;}
        }
    }

    /**
     * melanger les elements
     * @param tab tableau des elemnt a melanger
     */    // Pour mélanger un tableau en Java de manière vraiment aléatoire (équitable), on utilise l'algorithme de Fisher-Yates.
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
