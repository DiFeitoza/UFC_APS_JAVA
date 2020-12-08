import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Leitor scan = new Leitor();
        Scanner sc = new Scanner(System.in);
        String op = "";

        Produto p = new Produto(1, "alguma", 1.1, 1.1, 1.1, 2);
        System.out.println(p.getCusto());
        
        RevendaComArray r = new RevendaComArray(5);
        System.out.println(r);

        r.inserirProduto(p);
        r.comprar(1, 10);
        r.comprar(2, 10);
        r.vender(1, 5);
        r.vender(2, 5);
        r.consultaPrecoVenda(1);
        r.consultaPrecoVenda(2);
        r.listarPrecos();
        System.out.println(p.getQtd_estoque());

        while(op != "e"){
            System.out.println(
                "----------------------------REVENDACAR------------------------\n" + 
                "01. Criar Produto\n" +
                "02. Comprar\n" +
                "03. Vender\n" +
                "04. Consultar Preço\n" +
                "05. Listar Preço\n" +
                "06. Consultar Valor de Compra\n" +
                "07. Consultar Custo\n" +
                "08. Consultar Margem de Lucro\n" +
                "09. Alterar Valor de Compra\n" +
                "10. Alterar Custo - AC\n" +
                "11. Alterar Margem de Lucro\n\n" +
                "Digite o código à esquerda para acessar a opção correspondente"
            );

            op = sc.nextLine();

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
                System.out.println("\nNovo produto criado!\n" + novo.toString());
                // #melhoria - inserir um sys.pause aqui!
            } else if (op.contentEquals("02")){
                System.out.println("Digite o código do produto:");
                int cod = Integer.parseInt(sc.nextLine());
                System.out.println("Digite a quantidade comprada:");
                int qtd = Integer.parseInt(sc.nextLine());

                r.comprar(cod, qtd);
                Produto prod = r.GetProductByCode(cod);
                System.out.println("\nCompra efetuada!\n" + prod.toString() + "Estoque: " + prod.getQtd_estoque());
            } else if (op.contentEquals("03")){
                System.out.println("Digite o código do produto:");
                int cod = Integer.parseInt(sc.nextLine());
                System.out.println("Digite a quantidade vendida:");
                int qtd = Integer.parseInt(sc.nextLine());

                r.vender(cod, qtd);
                Produto prod = r.GetProductByCode(cod);
                System.out.println("\nVenda efetuada!\n" + prod.toString() + "Estoque: " + prod.getQtd_estoque());
            } else  System.out.println("???");
        }
        sc.close();
    }
}