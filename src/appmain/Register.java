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
            Costumer perfil = inputPerfilCostumer();
            addPerfilToDataCostumer(perfil);
        }

    }

    /**
     * @return Novo perfil de cliente (name, adress, celNumber)
     * @see model.Costumer
     */
    private static Costumer inputPerfilCostumer() {
        System.out.printf("\nCliente %d\n", Dados.getSizeOfCostumers() + 1);

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
            Product perfil = inputPerfilProduct();
            addPerfilToDataProduct(perfil);
        }

    }

    /**
     * @return Novo perfil de produto (name, description, value, profitPercentage,
     *         inStockQuant)
     * @see model.Product
     */
    private static Product inputPerfilProduct() {

        System.out.printf("\nProduto %d\n", Dados.getSizeOfProducts() + 1);

        System.out.print("\tNome : ");
        String name = Read.Line();

        System.out.print("\tDescrição : ");
        String description = Read.Line();

        System.out.print("\tValor R$ ");
        double value = Read.Double();

        System.out.print("\tLucro (0-100 %) : ");
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

    public static void sales() {
        Print.titulo("Cadastro de Venda");

        int selectCostumer, selectProduct, quantUnitSold;

        if (Dados.getSizeOfCostumers() < 0) {

            System.out.printf("Nenhum Cliente Cadastrado.");

        } else {

            Print.costumers();
            do {
                Print.split();
                System.out.printf("Selecione um Cliente Pela Sua Posição : ");
                selectCostumer = Read.Int();

                if (selectCostumer < Dados.getSizeOfCostumers() || selectCostumer > Dados.getSizeOfCostumers()) {
                    System.out.print("\nERRO: Número fora do intervalo! Digite novamente.\n\n");
                }
            } while (selectCostumer < Dados.getSizeOfCostumers() || selectCostumer > Dados.getSizeOfCostumers());

            do {
                if (Dados.getSizeOfProducts() < 0) {
                    System.out.printf("Nenhum Produto Cadastrado.");
                    break;
                } else {

                    Print.productsInStock();
                    do {
                        Print.split();
                        System.out.printf("Selecione o Produto Vendido Pela Sua Posição : ");
                        selectProduct = Read.Int();

                        if (selectProduct != 0 && (selectProduct < Dados.getSizeOfProducts()
                                || selectProduct > Dados.getSizeOfProducts())) {
                            System.out.print("\nERRO: Número fora do intervalo! Digite novamente.\n\n");
                        }

                    } while (selectProduct != 0 && (selectProduct < Dados.getSizeOfProducts()
                            || selectProduct > Dados.getSizeOfProducts()));
                    if (selectProduct != 0) {
                        System.out.printf("\nCliente Selecionado : %s\n",
                                Dados.getCostumer().get(selectCostumer - 1).getName());
                        System.out.printf("\tProduto Selecionado : %s\n",
                                Dados.getProducts().get(selectProduct - 1).getName());

                        do {
                            System.out.printf("\t\tDigite 0 para sair.\n");
                            System.out.printf(
                                    "\t\tNão pode ser um valor menor que 0 e nem maior que a quantidade em estoque. \n");
                            System.out.printf("\t\tQuantidade de unidades vendidas : ");
                            quantUnitSold = Read.Int();

                            if (quantUnitSold < 0
                                    || quantUnitSold > Dados.getProducts().get(selectProduct - 1).getInStockQuant())

                            {
                                System.out.printf("\t\tERRO: Quantidade inválida!\n");
                            }
                        } while (quantUnitSold < 0
                                || quantUnitSold > Dados.getProducts().get(selectProduct - 1).getInStockQuant());

                        // Atualizando base de dados
                        Dados.getProducts().get(selectProduct - 1).uptateStockQuant(quantUnitSold);
                    }
                }

            } while (selectProduct != 0);
        }
    }

}
