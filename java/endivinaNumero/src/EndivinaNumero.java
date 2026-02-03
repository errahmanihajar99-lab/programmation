import java.util.Scanner ; // importation de l'outil qui permet de lire ce que l'utilisateur écrit au clavier

// definition de la classe principale
/* C'est une nouveauté pour simplifier Java. Pour les petits programmes comme le tien, Java permet maintenant de supprimer
la ligne public class EndivinaNumero { ... } et d'écrire directement le code. C'est ce qu'on appelle les "Implicitly Declared Classes".
 */
    public static Scanner scan = new Scanner(System.in);// creation d'un scanner global pour lire les entrées
      //Modifier 'public' is redundant for 'main' method
      void main (String[] args) {// le point de départ du `programme

        String resposta; // variable pour stocker  ce que l'utilisation saisie
        do {
            int comp;

            ModelEndivina.reiniciarIntents();
            ModelEndivina.generarNAleatori();
            do {
                VistaEndivina.mostrarMissatge("escriu un numero enter entre 1 i 100");
                resposta = scan.nextLine();
                try {
                    int num = Integer.parseInt(resposta);
                    ModelEndivina.incrimentarIntents();
                    comp = ModelEndivina.compararNumero(num);
                    if (comp == 0)
                        VistaEndivina.mostrarMissatge("has adivinat el numero en " + ModelEndivina.getIntents() + "intents");
                    else if (comp > 0) VistaEndivina.mostrarMissatge("el numero es mes gran");
                    else VistaEndivina.mostrarMissatge("el numero es mes petit");
                }catch (NumberFormatException e){
                    VistaEndivina.mostrarMissatge("ERROR: Has d'introducir un numero");
                    comp = -1;
                }

            } while (comp != 0);
            VistaEndivina.mostrarMissatge("vols tornar a jogar");
            resposta = scan.nextLine();
        } while (resposta.equalsIgnoreCase("SI"));
    }

