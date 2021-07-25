package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe para armazenar dados
 */
public abstract class Dados {
    private static final ArrayList<Costumer> costumers = new ArrayList<>();
    private static final ArrayList<Product> products = new ArrayList<>();

    // Constructor
    private Dados() {
    }

    public static List<Costumer> getCostumer() {
        return costumers;
    }

    public static List<Product> getProducts() {
        return products;
    }
}
