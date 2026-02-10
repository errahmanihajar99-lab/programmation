import java.util.Scanner;

public class llibreriaEnters {
    public static Scanner scan = new Scanner(System.in);

    public static <exeption> int demanarEnter(){
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


}

