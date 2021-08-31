package appmain;

import model.Customer;
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
    public static Customer customer(String searchName) {
        for (Customer customer : Dados.getCustomer()) {
            if (customer.getName().equals(searchName)) {
                return customer;
            }
        }
        return null;

    }

    /**
     * Immprime as informações do profile compatível com o nome pesquisado.
     * 
     * @param customer
     */
    public static void customerResult(Customer customer) {
        System.out.printf("1. - %s | %s | %s\n", customer.getName(), customer.getAdress(), customer.getCelNumber());
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
