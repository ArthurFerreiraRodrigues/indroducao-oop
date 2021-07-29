package helper;

public class Menu {
    /**
     * Imprime as opções do menu
     *
     */
    public static void options() {
        Print.titulo("Menu");

        System.out.printf(".1 - Cadastro de novo cliente    \n");
        System.out.printf(".2 - Busca por cliente           \n");
        System.out.printf(".3 - Cadastro de novo produto    \n");
        System.out.printf(".4 - Busca por produto           \n");
        System.out.printf(".5 - Cadastro de venda           \n");
        System.out.printf(".6 - Mostrar produtos em estoque \n");
        System.out.printf(".7 - Sair                          ");

        Print.split();
    }

    public static void case1() {

    }

}
