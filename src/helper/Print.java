package helper;

import model.Dados;
import model.Product;

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

    /**
     * Case 6 : O programa deverá mostrar a lista de todos os produtos cadastrados
     * com a quantidade em estoque de cada um deles.
     */
    public static void productsInStock() {
        int contador = 1;

        Print.titulo("Mostrar Produtos em Estoque");

        for (Product product : Dados.getProducts()) {
            System.out.printf(".%d - %s | %f | %d", contador, product.getName(), product.getValue(),
                    product.getInStockQuant());

            contador++;
        }

    }
}
