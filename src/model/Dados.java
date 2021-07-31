package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe para armazenar dados
 */
public abstract class Dados {
    private static final ArrayList<Costumer> costumers = new ArrayList<>();
    private static final ArrayList<Product> products = new ArrayList<>();

    /**
     * @return Lista de Clientes
     */
    public static List<Costumer> getCostumer() {
        return costumers;
    }

    /**
     * @return Lista de Produtos
     */
    public static List<Product> getProducts() {
        return products;
    }

    /**
     * @return Tamanho da Lista Clientes
     */
    public static int getSizeOfCostumers() {
        return costumers.size();
    }

    /**
     * @return Tamanho da Lista Produtos
     */
    public static int getSizeOfProducts() {
        return products.size();
    }
}
