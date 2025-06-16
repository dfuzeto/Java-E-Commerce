package Produtos;

public class ProdutoFisico extends Produto {

    public ProdutoFisico(String nome, String descricao, double preco) {
        super(nome, descricao, preco);
    }

    @Override
    public double calcularFrete() {
        return 10;
    }
}
