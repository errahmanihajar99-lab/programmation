public class ModelEndivina {
    private static int intents;
    private static int nAleatori;

    public static void generarNAleatori(){
        nAleatori = (int) (Math.random()*100)+1;
    }

    public static void reiniciarIntents(){
        intents = 0 ;
    }

    public static void incrimentarIntents(){
        intents++ ;
    }

    public static int compararNumero(int num){
        return Integer.compare(nAleatori, num);
    }

    public static int getIntents() {
        return intents;
    }


}
