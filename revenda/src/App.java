import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String op = "";

        RevendaComArray r = new RevendaComArray(100);

        while(op != "e"){
            System.out.println(
                "----------------------------REVENDACAR------------------------\n" + 
                "01. Criar Produto\n" +
                "02. Comprar\n" +
                "03. Vender\n" +
                "04. Consultar Preço\n" +
                "05. Listar Preços\n" +
                "06. Consultar Valor de Compra\n" +
                "07. Consultar Custo\n" +
                "08. Consultar Margem de Lucro\n" +
                "09. Alterar Valor de Compra\n" +
                "10. Alterar Custo\n" +
                "11. Alterar Margem de Lucro\n\n" +
                "Digite o código à esquerda para acessar a opção correspondente"
            );

            op = sc.nextLine();

            //ignorando entradas que comecem com '/' para facilitar inputs em lote
            while(op.subSequence(0, 1).equals("/")){
                op = sc.nextLine();
            }

            try{
                if(op.contentEquals("01")){
                    System.out.println("Digite um código para o novo produto:");
                    int codigo = Integer.parseInt(sc.nextLine());
                    System.out.println("Digite uma descrição para o novo produto:");
                    String descricao = sc.nextLine();
                    System.out.println("Digite um valor de compra para o novo produto:");
                    double vl_compra = Double.parseDouble(sc.nextLine());
                    System.out.println("Digite um valor de custo para o novo produto:");
                    double custo = Double.parseDouble(sc.nextLine());
                    System.out.println("Digite uma margem de lucro para o novo produto:");
                    double margem_lucro = Double.parseDouble(sc.nextLine());
                    System.out.println("Digite a quantidade em estoque para o novo produto:");
                    int qtd_estoque = Integer.parseInt(sc.nextLine());

                    Produto novo = new Produto(codigo, descricao, vl_compra, custo, margem_lucro, qtd_estoque);
                    r.inserirProduto(novo);
                    System.out.println("\n#Novo produto criado!\n" + novo.toString());
                } else if (op.contentEquals("02")){
                    System.out.println("Digite o código do produto:");
                    int cod = Integer.parseInt(sc.nextLine());
                    System.out.println("Digite a quantidade comprada:");
                    int qtd = Integer.parseInt(sc.nextLine());

                    r.comprar(cod, qtd);
                    Produto prod = r.GetProductByCode(cod);
                    System.out.println("\n#Compra efetuada!\n" + prod.toString() + "\nEstoque: " + prod.getQtd_estoque());
                } else if (op.contentEquals("03")){
                    System.out.println("Digite o código do produto:");
                    int cod = Integer.parseInt(sc.nextLine());
                    System.out.println("Digite a quantidade vendida:");
                    int qtd = Integer.parseInt(sc.nextLine());

                    r.vender(cod, qtd);
                    Produto prod = r.GetProductByCode(cod);
                    System.out.println("\n#Venda efetuada!\n" + prod.toString() + "\nEstoque: " + prod.getQtd_estoque());
                } else if (op.contentEquals("04")){
                    System.out.println("Digite o código do produto:");
                    int cod = Integer.parseInt(sc.nextLine());

                    Produto prod = r.GetProductByCode(cod);
                    System.out.println("\n#Valor de venda\n" + prod.toString() + "\nValor de venda: " + prod.calculaPrecoVenda());
                } else if (op.contentEquals("05")){
                    System.out.println("\n#Lista de Preços");
                    r.listarPrecos();
                } else if (op.contentEquals("06")){
                    System.out.println("Digite o código do produto:");
                    int cod = Integer.parseInt(sc.nextLine());

                    Produto prod = r.GetProductByCode(cod);
                    System.out.println("\n#Consulta valor de compra\n" + prod.toString() + "\nValor de Compra: " + prod.getVl_compra());
                } else if (op.contentEquals("07")){
                    System.out.println("Digite o código do produto:");
                    int cod = Integer.parseInt(sc.nextLine());

                    Produto prod = r.GetProductByCode(cod);
                    System.out.println("\n#Consulta valor de custo\n" + prod.toString() + "\nValor de Custo: " + prod.getCusto());
                } else if (op.contentEquals("08")){
                    System.out.println("Digite o código do produto:");
                    int cod = Integer.parseInt(sc.nextLine());

                    Produto prod = r.GetProductByCode(cod);
                    System.out.println("\n#Consulta margem de lucro\n" + prod.toString() + "\nMargem de lucro: " + prod.getMargem_lucro()*100 + "%");
                } else if (op.contentEquals("09")){
                    System.out.println("Digite o código do produto:");
                    int cod = Integer.parseInt(sc.nextLine());
                    System.out.println("Digite o novo valor de compra:");
                    double value = Double.parseDouble(sc.nextLine());

                    Produto prod = r.GetProductByCode(cod);
                    prod.setVl_compra(value);
                    System.out.println("\n#Novo valor de compra\n" + prod.toString() + "\nValor de Compra: " + prod.getVl_compra());
                } else if (op.contentEquals("10")){
                    System.out.println("Digite o código do produto:");
                    int cod = Integer.parseInt(sc.nextLine());
                    System.out.println("Digite o novo valor de custo:");
                    double value = Double.parseDouble(sc.nextLine());

                    Produto prod = r.GetProductByCode(cod);
                    prod.setCusto(value);
                    System.out.println("\n#Novo valor de custo\n" + prod.toString() + "\nValor de Custo: " + prod.getCusto());
                } else if (op.contentEquals("11")){
                    System.out.println("Digite o código do produto:");
                    int cod = Integer.parseInt(sc.nextLine());
                    System.out.println("Digite a nova margem de lucro (valor decimal):");
                    double value = Double.parseDouble(sc.nextLine());

                    Produto prod = r.GetProductByCode(cod);
                    prod.setMargem_lucro(value);
                    System.out.println("\n#Novo margem de lucro\n" + prod.toString() + "\nMargem de Lucro: " + prod.getMargem_lucro()*100 + "%");
                } else System.out.println("???");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        sc.close();
    }
}

// #sugestoes: melhorar mensagens de exceção, tratamentos de outras exceções, deixar o codigo mais vertical, implementar interface grafica.