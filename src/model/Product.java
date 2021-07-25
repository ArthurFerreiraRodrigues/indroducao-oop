package model;

public class Product {
    private String name;
    private String description;
    private double value;
    private double profitPercentage;
    private int inStockQuant;

    /**
     * Gera o perfil do produto
     * 
     * @param name             : nome do produto
     * @param description      : descricao do produto
     * @param value            : valor do produto
     * @param profitPercentage : porcentagem de lucro
     * @param inStockQuant     : quantidade em estoque
     */
    public Product(String name, String description, double value, double profitPercentage, int inStockQuant) {
        this.name = name;
        this.description = description;
        this.value = value;
        this.profitPercentage = profitPercentage;
        this.inStockQuant = inStockQuant;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getValue() {
        return value;
    }

    public double getProfitPercentage() {
        return profitPercentage;
    }

    public int getInStockQuant() {
        return inStockQuant;
    }

}
