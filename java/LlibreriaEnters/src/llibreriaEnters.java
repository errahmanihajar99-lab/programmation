import java.util.Scanner;


/**
 * Cette classe contient deux fonctions pour pour realizer la methode de try catch
 * Elle fait partie de la llibreriaEnters
 * @author Hajar Errahmani
 * @version 1.0
 */
public class llibreriaEnters {
    public static Scanner scan = new Scanner(System.in);

    /**
     * Funció pour demander un nombre intere
     * @return la valeur introduite par l'utilisateur
     */
    public static int demanarEnter(){
        int n = 0;
        boolean ok = false;

        do {
            try {
                System.out.println("Introdueix un numero inter");
                String resposte = scan.nextLine();

                n = Integer.parseInt(resposte);
                ok = true;
            }catch (Exception e){System.out.print("Error: la resposte no es un numero");}
        }while (!ok);
        return n;
    }


    /**
     * Funció pour deviser deux valeurs
     * @return la valeur du devision
     */
    public static  int divisionEnters(){
        int rs = 0;

            try {
                System.out.println("Introdueix el primer numro");
                int n1 = demanarEnter();
                System.out.println("Introdueix el segon numro diferent que 0");
                int n2 = demanarEnter();

                // The JVM will automatically throw ArithmeticException if n2 is 0
                rs = n1/n2;
            }catch (ArithmeticException e){
                System.out.println("Error: no es pot dividir per 0");
            }
        return rs;
    }

}

