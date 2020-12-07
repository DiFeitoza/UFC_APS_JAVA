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
                System.out.println(p);
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


}

/* 
• Um método "listaPrecos" que imprime o código, a descrição e o valor de venda de todos os produtos;


• Um atributo "produtos" (do tipo array de Produto), privado (utilize a classe Produto criada no exercício anterior);
• Um atributo privado para servir de índice.

• Um construtor que recebe como argumento a quantidade de produtos e inicializa o atributo "produtos" com um
array de produtos com o tamanho especificado;
• Um método "inserirProduto" que recebe como parâmetro um Produto e o insere no array;

• Um método "comprar" que recebe como parâmetro o código de um Produto e quantidade de unidades deste
produto que foi adquirida pela revenda, percorre o array procurando o Produto e incrementa a quantidade em
estoque deste produto, caso ele não exista, o método deve imprimir uma mensagem de erro;

• Um método "vender" que recebe como parâmetro o código de um Produto e quantidade de unidades deste
produto que foi vendida pela revenda, percorre o array procurando o Produto e decrementa a quantidade em
estoque deste produto, caso ele não exista, o método deve imprimir uma mensagem de erro;

• Um método "consultaPrecoVenda" que recebe como parâmetro o código de um Produto, percorre o array
procurando o Produto e imprime o valor de venda deste produto, caso ele não exista, o método deve imprimir
uma mensagem de erro;
*/