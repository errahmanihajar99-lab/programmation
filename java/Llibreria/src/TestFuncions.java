import input.input;
import arrays.IntegerArrays;
import arrays.StringArrays;

/**
 * Cette classe contient des outils pour tester les méthodes.
 * Elle fait partie de la bibliothèque de gestion de données.
 * @author Hajar Errahmani
 * @version 1.0
 */
public class TestFuncions {
    public static void main(String[] args){
        System.out.println("=== TEST DE MA LIBRAIRIE ===\n");

        // 1. Test du package INPUT
        System.out.println("--- Test InputControl ---");
        int taille = input.introduirNumeroEnter("Entrez la taille du tableau à créer :");

        // 2. Test du package ARRAYS (Entiers)
        System.out.println("\n--- Test IntegerArrays ---");
        int[] monTab = IntegerArrays.crearArrayInt(taille);
        IntegerArrays.iniciArrayInt(monTab, 7); // Remplit de 7
        System.out.println("Tableau initialisé avec des 7 :");
        IntegerArrays.mostrarVArrayInt(monTab);

        // Test du mélange
        System.out.println("Remplissage aléatoire et mélange...");
        // (Tu pourrais ajouter ici une boucle pour mettre des chiffres différents)
        IntegerArrays.melangerInt(monTab);
        IntegerArrays.mostrarVArrayInt(monTab);

        // 3. Test du package ARRAYS (Strings)
        System.out.println("\n--- Test StringArrays ---");
        String[] mots = {"Java", "Code", "Library", "Hajar"};
        System.out.println("Tableau original :");
        StringArrays.mostrarVArrayStr(mots);

        StringArrays.inversarElementsStr(mots);
        System.out.println("Tableau inversé :");
        StringArrays.mostrarVArrayStr(mots);

        System.out.println("\n=== FIN DES TESTS ===");
    }
}