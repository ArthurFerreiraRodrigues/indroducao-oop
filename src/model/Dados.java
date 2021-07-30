package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe para armazenar dados
 */
public abstract class Dados {
    private static final ArrayList<Costumer> costumers = new ArrayList<>();
    private static final ArrayList<Product> products = new ArrayList<>();

    public static List<Costumer> getCostumer() {
        return costumers;
    }

    public static List<Product> getProducts() {
        return products;
    }

    public static int getSizeOfCostumers() {
        return costumers.size();
    }

    public static int getSizeOfProducts() {
        return products.size();
    }
}
