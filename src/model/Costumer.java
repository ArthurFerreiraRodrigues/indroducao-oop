package model;

public class Costumer {

    private String name, adress;
    private String celNumber;

    /**
     * Gera o perfil do cliente
     * 
     * @param name      : nome do cliente
     * @param adress    : endereco do cliente
     * @param celNumber : numero de celular do cliente
     */
    public Costumer(String name, String adress, String celNumber) {
        this.name = name;
        this.adress = adress;
        this.celNumber = celNumber;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public String getCelNumber() {
        return celNumber;
    }

}
