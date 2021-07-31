package appmain;

import helper.Read;
import helper.Fill;
import helper.Print;

/**
 * Arquivo main.
 * 
 * @author ArthurFerreiraRodrigues/200056981/
 */
public class App {
    public static void main(String[] args) throws Exception {
        int close = 0;

        // Pre Filling
        Fill.costumer();
        Fill.productList();

        // Menu
        do {
            Menu.options();
            int option = Read.menu();
            switch (option) {
                case 1:
                    Menu.case1(); // Caastro de Novo Cliente
                    break;
                case 2:
                    Menu.case2(); // Busca por Cliente
                    break;
                case 3:
                    Menu.case3(); // Cadastro de Novo Produto
                    break;
                case 4:
                    Menu.case4(); // Busca por Produto
                    break;
                case 5:
                    Menu.case5(); // Cadastro de Venda
                    break;
                case 6:
                    Menu.case6(); // Mostrar Produtos em Estoque
                    break;
                case 7:
                    close = Menu.case7(); // Sair
                    break;
                default:
                    Print.split();
                    System.out.println("ERRO: Número fora do intervalo! Digite novamente.");
                    break;
            }
        } while (close == 0);
    }
}
