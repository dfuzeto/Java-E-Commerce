package Cliente;
import Pagamento.Pagamento;
import Produtos.Produto;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Produto>  produtos = new ArrayList<>();
    private Pagamento pagamento;

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado: " + produto.getNome());
    }


    public void definirMetodoPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void finalizarPedido() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
            total += produto.calcularFrete();
        }
        if (pagamento.processarPagamento(total)) {
            System.out.println("Pedido finalizado!");
        } else {
            System.out.println("Erro!");
        }
    }
}
