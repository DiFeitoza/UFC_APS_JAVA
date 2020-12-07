public class Produto {
    private int codigo;
    private String descricao;
    private double vl_compra;
    private double custo;
    private double margem_lucro;
    private int qtd_estoque;
    
    public Produto(int codigo, String descricao){
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Produto(int codigo, String descricao, double vl_compra, double custo, double margem_lucro){
        this.codigo = codigo;
        this.descricao = descricao;
        this.vl_compra = vl_compra;
        this.custo = custo;
        this.margem_lucro = margem_lucro;
    }
    
    public Produto(int codigo, String descricao, double vl_compra, double custo, double margem_lucro, int qtd_estoque){
        this.codigo = codigo;
        this.descricao = descricao;
        this.vl_compra = vl_compra;
        this.custo = custo;
        this.margem_lucro = margem_lucro;
        this.qtd_estoque = qtd_estoque;
    }

    public double getVl_compra(){
        return this.vl_compra;
    }

    public double getCusto(){
        return this.custo;
    }

    public double getMargem_lucro(){
        return this.margem_lucro;
    }

    public void setVl_compra(double value){
        this.vl_compra = value;
    }

    public void setCusto(double value){
        this.custo = value;
    }

    public void setMargem_lucro(double value){
        this.margem_lucro = value;
    }

    void compra(int qtd){
        qtd_estoque = qtd_estoque + qtd;
    }
    
    void venda(int qtd){
        qtd_estoque = qtd_estoque - qtd;
    }

    double calculaPrecoVenda( ){
        return vl_compra + custo + margem_lucro * (vl_compra + custo);
    }

/*  
    crie um construtor para inicializar o valor dos atributos: código e descrição

    crie um construtor para inicializar o valor dos atributos: código, descrição, valor de compra, custo e
    margem de lucro

    crie um construtor para inicializar o valor dos atributos: código, descrição, valor de compra, custo,
    margem de lucro e quantidade em estoque */
}