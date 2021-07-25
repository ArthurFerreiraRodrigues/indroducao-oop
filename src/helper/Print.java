package helper;

public class Print {
    /**
     * Imprime espaços ate que a palavra esteja ao centro
     * 
     * @param tamTexto
     * @param tamDivisor
     */
    private static void printEspacoMeio(int tamTexto, int tamDivisor) {

        int quantEspacos, i;
        quantEspacos = (tamDivisor - tamTexto) / 2;

        for (i = 0; i < quantEspacos; i++) {
            System.out.printf(" ");
        }

    }

    /**
     * Cria uma linha e "-" no terminal
     */
    public static void split() {
        System.out.printf("\n------------------------------------------------------------\n");
    }

    /**
     * Imprime uma string ao centro da linha
     * 
     * @param string
     */
    public static void titulo(String string) {
        Print.split();
        Print.printEspacoMeio(string.length(), 60);
        System.out.print(string);
        Print.split();
    }

}
