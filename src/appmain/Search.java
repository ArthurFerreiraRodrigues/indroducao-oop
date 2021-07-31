package appmain;

import model.Costumer;
import model.Product;
import model.Dados;

public class Search {

    // Cliente

    public static Costumer costumer(String searchName) {
        for (Costumer costumer : Dados.getCostumer()) {
            if (costumer.getName().equals(searchName)) {
                return costumer;
            }
        }
        return null;
    }

    public static void costumerResult(Costumer costumer) {
        System.out.printf("1. - %s | %s | %s\n", costumer.getName(), costumer.getAdress(), costumer.getCelNumber());
    }

    // Produto

    public static Product product(String searchName) {
        for (Product product : Dados.getProducts()) {
            if (product.getName().equals(searchName)) {
                return product;
            }
        }
        return null;
    }

    public static void productResult(Product product) {
        System.out.printf(".1 - %s | %s | R$ %.2f | %.2f | %d un.\n", product.getName(), product.getDescription(),
                product.getValue(), product.getProfitPercentage(), product.getInStockQuant());
    }
}
