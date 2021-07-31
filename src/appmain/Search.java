package appmain;

import model.Costumer;
import model.Product;
import model.Dados;

public class Search {

    // Cliente

    /**
     * Busca um cliente com nome igual ao nome pesquisado. Retorna 'null' se não for
     * encontrado um profile compatível.
     * 
     * @param searchName
     * @return Profile do Cliente Pesquisado
     * 
     * @see appmain.Menu Menu.case2()
     */
    public static Costumer costumer(String searchName) {
        for (Costumer costumer : Dados.getCostumer()) {
            if (costumer.getName().equals(searchName)) {
                return costumer;
            }
        }
        return null;

    }

    /**
     * Immprime as informações do profile compatível com o nome pesquisado.
     * 
     * @param costumer
     */
    public static void costumerResult(Costumer costumer) {
        System.out.printf("1. - %s | %s | %s\n", costumer.getName(), costumer.getAdress(), costumer.getCelNumber());
    }

    // Produto

    /**
     * Busca um produto com nome igual ao nome pesquisado. Retorna 'null' se não for
     * encontrado um profile compatível.
     * 
     * @param searchName
     * @return Profile do Produto Pesquisado
     * @see appmain.Menu Menu.case4()
     */
    public static Product product(String searchName) {
        for (Product product : Dados.getProducts()) {
            if (product.getName().equals(searchName)) {
                return product;
            }
        }
        return null;
    }

    /**
     * Immprime as informações do profile compatível com o nome pesquisado.
     * 
     * @param product
     */
    public static void productResult(Product product) {
        System.out.printf(".1 - %s | %s | R$ %.2f | %.2f | %d un.\n", product.getName(), product.getDescription(),
                product.getValue(), product.getProfitPercentage(), product.getInStockQuant());
    }
}
