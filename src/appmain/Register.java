package appmain;

import helper.Print;
import helper.Read;

import model.Costumer;
import model.Dados;
import model.Product;

public class Register {

    // Costumers

    /**
     * Recebe numero de clientes que serao cadastrados e gera novos perfis.
     */
    public static void costumer() {
        Print.titulo("Cadastro de Novo Cliente");

        System.out.print("Quantidade de clientes a serem cadastrados : ");
        int quantCostumers = Read.Int();
        for (int i = 0; i < quantCostumers; i++) {
            Costumer perfil = inputPerfilCostumer(i + 1);
            addPerfilToDataCostumer(perfil);
        }

    }

    /**
     * @return Novo perfil de cliente (name, adress, celNumber)
     * @see model.Costumer
     */
    private static Costumer inputPerfilCostumer(int cont) {

        System.out.printf("Cliente %d\n", cont);

        System.out.print("\tNome : ");
        String name = Read.Line();
        System.out.print("\tEndereço : ");
        String adress = Read.Line();
        System.out.print("\tNúmero de Celular : ");
        String celNumber = Read.Line();

        return new Costumer(name, adress, celNumber);
    }

    /**
     * Adiciona parametro "perfil" a dados.
     * 
     * @param perfil
     * @see model.Dados
     */
    private static void addPerfilToDataCostumer(Costumer perfil) {
        Dados.getCostumer().add(perfil);
    }

    // Products

    /**
     * Recebe numero de produtos que serao cadastrados e gera novos perfis.
     */
    public static void product() {
        Print.titulo("Cadastro de Novo Produto");

        System.out.printf("Quantidade de produtos a serem cadastrados : ");
        int quantProducts = Read.Int();
        for (int i = 0; i < quantProducts; i++) {
            Product perfil = inputPerfilProduct(i + 1);
            addPerfilToDataProduct(perfil);
        }

    }

    /**
     * @return Novo perfil de produto (name, description, value, profitPercentage,
     *         inStockQuant)
     * @see model.Product
     */
    private static Product inputPerfilProduct(int cont) {

        System.out.printf("Produto %d\n", cont);

        System.out.print("\tNome : ");
        String name = Read.Line();

        System.out.print("\tDescrição : ");
        String description = Read.Line();

        System.out.print("\tValor R$");
        double value = Read.Double();

        System.out.print("\tLucro (%) : ");
        double profitPercentage = Read.Double();

        System.out.print("\tQuantidade em Estoque : ");
        int inStockQuant = Read.Int();

        return new Product(name, description, value, profitPercentage, inStockQuant);
    }

    /**
     * Adiciona parametro "perfil" a dados.
     * 
     * @param perfil
     * @see model.Dados
     */
    private static void addPerfilToDataProduct(Product perfil) {
        Dados.getProducts().add(perfil);
    }

}
