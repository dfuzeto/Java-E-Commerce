package Produtos;

public class ProdutoDigital extends Produto {

    public ProdutoDigital(String nome, String descricao, double preco) {
        super(nome, descricao, preco);
    }

    @Override
    public double calcularFrete() {
        return 0;
    }


}
