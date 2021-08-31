package appmain;

import helper.Print;
import helper.Read;

import model.Customer;
import model.Dados;
import model.Product;

public class Register {

    // Customers

    /**
     * Recebe numero de clientes que serao cadastrados e gera novos perfis.
     * 
     * @see model.Customer
     */
    public static void customer() {
        Print.titulo("Cadastro de Novo Cliente");

        System.out.print("Quantidade de clientes a serem cadastrados : ");
        int quantCustomers = Read.Int();
        for (int i = 0; i < quantCustomers; i++) {
            Customer profile = inputProfileCustomer();
            addProfileToDataCustomer(profile);
        }

    }

    /**
     * Recebe as informações do cliente.
     * 
     * @return Novo profile de cliente (name, adress, celNumber)
     * @see model.Customer
     */
    private static Customer inputProfileCustomer() {
        System.out.printf("\nCliente %d\n", Dados.getSizeOfCustomers() + 1);

        System.out.print("\tNome : ");
        String name = Read.Line();
        System.out.print("\tEndereço : ");
        String adress = Read.Line();
        System.out.print("\tNúmero de Celular : ");
        String celNumber = Read.Line();

        return new Customer(name, adress, celNumber);
    }

    /**
     * Adiciona parametro "profile" a dados.
     * 
     * @param profile
     * @see model.Dados
     */
    private static void addProfileToDataCustomer(Customer profile) {
        Dados.getCustomer().add(profile);
    }

    // Products

    /**
     * Recebe numero de produtos que serao cadastrados e gera novos perfis.
     * 
     * @see model.Product
     */
    public static void product() {
        Print.titulo("Cadastro de Novo Produto");

        System.out.printf("Quantidade de produtos a serem cadastrados : ");
        int quantProducts = Read.Int();
        for (int i = 0; i < quantProducts; i++) {
            Product profile = inputProfileProduct();
            addProfileToDataProduct(profile);
        }

    }

    /**
     * Recebe as informações do produto.
     * 
     * @return Novo profile de produto (name, description, value, profitPercentage,
     *         inStockQuant)
     * @see model.Product
     */
    private static Product inputProfileProduct() {

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
     * Adiciona parametro "profile" a dados.
     * 
     * @param profile
     * @see model.Dados
     */
    private static void addProfileToDataProduct(Product profile) {
        Dados.getProducts().add(profile);
    }

    /**
     * Imprime a lista de clientes, recebe escolha do cliente, imprime lista de
     * produtos, recebe escolha de produto, recebe quantidade de unidades vendidas.
     * 
     * @see model.Dados
     */
    public static void sales() {
        Print.titulo("Cadastro de Venda");

        int selectCustomer, selectProduct, quantUnitSold;

        if (Dados.getSizeOfCustomers() < 0) {

            System.out.printf("Nenhum Cliente Cadastrado.");

        } else {

            Print.customers();
            do {
                Print.split();
                System.out.printf("Selecione um Cliente Pela Sua Posição : ");
                selectCustomer = Read.Int();

                if (selectCustomer < 1 || selectCustomer > Dados.getSizeOfCustomers()) {
                    System.out.print("\nERRO: Número fora do intervalo! Digite novamente.\n\n");
                }
            } while (selectCustomer < 1 || selectCustomer > Dados.getSizeOfCustomers());

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

                        if (selectProduct != 0 && (selectProduct < 1 || selectProduct > Dados.getSizeOfProducts())) {
                            System.out.print("\nERRO: Número fora do intervalo! Digite novamente.\n\n");
                        }

                    } while (selectProduct != 0 && (selectProduct < 1 || selectProduct > Dados.getSizeOfProducts()));
                    if (selectProduct != 0) {
                        System.out.printf("\nCliente Selecionado : %s\n",
                                Dados.getCustomer().get(selectCustomer - 1).getName());
                        System.out.printf("\tProduto Selecionado : %s\n",
                                Dados.getProducts().get(selectProduct - 1).getName());
                        System.out.printf("\t\tDigite 0 para sair.\n");
                        System.out.printf(
                                "\t\tNão pode ser um valor menor que 0 e nem maior que a quantidade em estoque. \n");
                        System.out.printf("\t\tQuantidade de unidades vendidas : ");
                        do {
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
