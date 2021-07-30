package appmain;

import helper.Print;

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
        Register.costumer();
    }

    public static void case2() {

    }

    private static int thereIsProduct = 0;

    public static void case3() {
        Register.product();
        thereIsProduct = 1;
    }

    public static void case4() {

    }

    public static void case5() {
        Register.sales();
    }

    /**
     * 
     */
    public static void case6() {
        if (thereIsProduct == 1) { // @see Menu.case2()
            Print.productsInStock();
        } else {
            Print.split();
            System.out.printf("ERRO: Nenhum Produto Cadastrado!");
        }
    }

    /**
     * Imprime uma mensagem de despedida e atualiza valor de close.
     * 
     * @return "Programa Encerrado!" | Retorna 1 (true)
     * 
     */
    public static int case7() {
        Print.split();
        System.out.println("Programa Encerrado!");
        Print.split();
        return 1;
    }

}
