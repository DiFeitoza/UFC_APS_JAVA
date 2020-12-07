public class App {
    public static void main(String[] args) throws Exception {
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
                "Criar Produto - NP" + "\n" +
                "Comprar - C" + "\n" +
                "Vender - V" + "\n" +
                "Consultar Preço - CP" + "\n" +
                "Listar Preço - LP" + "\n" +
                "Consultar Valor de Compra - CVC" + "\n" +
                "Consultar Custo - CC" + "\n" +
                "Consultar Margem de Lucro - CML" + "\n" +
                "Alterar Valor de Compra - AVC" + "\n" +
                "Alterar Custo - AC" + "\n" +
                "Alterar Margem de Lucro - AML" + "\n"
            );
        }
    }

}