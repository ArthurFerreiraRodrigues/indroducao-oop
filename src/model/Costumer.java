package model;

import helper.Print;
import helper.Read;

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

    // Setters

    public void updateCostumerInfo() {
        Print.titulo("Alterar Dados do Cliente");
        System.out.printf("Novo Nome :");
        name = Read.Line();
        System.out.printf("Novo Endereço :");
        adress = Read.Line();
        System.out.printf("Novo Telefone :");
        celNumber = Read.Line();
    }

}
