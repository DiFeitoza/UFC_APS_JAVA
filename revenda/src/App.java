public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Produto p = new Produto(1, "alguma", 1.1, 1.1, 1.1, 2);
        System.out.println(p.getCusto());
        
        RevendaComArray r = new RevendaComArray(5);
        System.out.println(r);

        r.inserirProduto(p);
        r.comprar(2, 10);
        r.listarPrecos();
        System.out.println(p.getQtd_estoque());
    }
}