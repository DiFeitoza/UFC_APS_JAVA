public class RevendaComArray {
    private Produto[] produtos;
    private int id = 0;
    
    public RevendaComArray(int qtd){
        this.produtos = new Produto[qtd];
    }
    
    @Override
    public String toString(){
        return "String";
    }

    public void inserirProduto(Produto p){
        for(int i = 0; i < this.produtos.length; i++){
            if(this.produtos[i] != null){
                this.id += 1;
            }
        }
        this.produtos[id] = p;
    }

    public void listarPrecos() {
        for(Produto p : this.produtos) {
            if(p != null){
                System.out.println(p + "\nValor de venda: " + p.calculaPrecoVenda() + "\n");
            }
        }
    }

    public void comprar(int cod, int qtd){
        try{
            for(Produto p : this.produtos){
                if(p != null){
                    if(p.getCodigo() == cod){
                        p.compra(qtd);
                        return;
                    }
                }
            }
            throw new Exception("Produto não cadastrado");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void vender(int cod, int qtd){
        try{
            for(Produto p : this.produtos){
                if(p != null){
                    if(p.getCodigo() == cod){
                        p.venda(qtd);
                        return;
                    }
                }
            }
            throw new Exception("Produto não cadastrado");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void consultaPrecoVenda(int cod){
        try{
            for(Produto p : this.produtos){
                if(p != null){
                    if(p.getCodigo() == cod){
                        System.out.println(p.calculaPrecoVenda());
                    }
                }
            }
            throw new Exception("Produto não cadastrado");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Produto GetProductByCode(int cod){
        try{
            for(Produto p : this.produtos){
                if(p != null){
                    if(p.getCodigo() == cod){
                        return p;
                    }
                }
            }
            throw new Exception("Produto não cadastrado");
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}