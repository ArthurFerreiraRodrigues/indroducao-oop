package appmain;

import helper.Print;
import helper.Read;
import model.Costumer;
import model.Product;

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
        String searchName;
        Costumer match;
        int confirmEdit;

        Print.tituloAndDescription("Busca por Cliente", "Nome | Endereço | Telefone");

        System.out.printf("Buscar Nome : ");
        searchName = Read.Line();
        match = Search.costumer(searchName);

        if (match == null) {
            System.out.printf("\nCliente não encontrado!");
        } else {
            System.out.printf("Resultado :\n");
            Search.costumerResult(match);

            do {
                System.out.printf("\nAlterar Dados Cadastrais do Cliente ?\n\t.1 - Sim\n\t.2 - Não, voltar ao menu");
                System.out.printf("\n\nEscolha : ");
                confirmEdit = Read.Int();
                switch (confirmEdit) {
                    case 1:
                        match.updateCostumerInfo();
                        break;
                    case 2:
                        System.out.println("Voltando ao menu.");
                        break;
                    default:
                        System.out.printf("\nDigite uma opção válida.");
                        break;
                }
            } while (confirmEdit != 1 && confirmEdit != 2);

        }

    }

    private static int thereIsProduct = 0;

    public static void case3() {
        Register.product();
        thereIsProduct = 1;
    }

    public static void case4() {
        String searchName;
        Product match;
        int confirmEdit;

        Print.tituloAndDescription("Busca por Produto", "Nome | Descrição | Valor | Porcentagem de Lucro | Unidades");

        System.out.printf("Buscar Nome : ");
        searchName = Read.Line();
        match = Search.product(searchName);

        if (match == null) {
            System.out.printf("\nProduto não encontrado!");
        } else {
            System.out.printf("Resultado :\n");
            Search.productResult(match);

            do {
                System.out.printf("\nAlterar Dados Cadastrais do Produto ?\n\t.1 - Sim\n\t.2 - Não, voltar ao menu");
                System.out.printf("\n\nEscolha : ");
                confirmEdit = Read.Int();
                switch (confirmEdit) {
                    case 1:
                        match.updateProductInfo();
                        break;
                    case 2:
                        System.out.println("Voltando ao menu.");
                        break;
                    default:
                        System.out.printf("\nDigite uma opção válida.");
                        break;
                }
            } while (confirmEdit != 1 && confirmEdit != 2);

        }

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
