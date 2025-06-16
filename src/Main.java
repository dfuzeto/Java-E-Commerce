import Cliente.Cliente;
import Cliente.Pedido;
import Pagamento.Paypal;
import Produtos.Produto;
import Produtos.ProdutoDigital;
import Produtos.ProdutoFisico;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new ProdutoFisico("Camiseta Java", "Camiseta para programadores java", 30);
        Produto produto2 = new ProdutoDigital("Ebook Java para Iniciantes", "Aprenda java do 0", 50);


        Paypal pagamento = new Paypal("cliente@exemplo.com");


        Pedido pedido = new Pedido();
        pedido.adicionarProduto(produto1);
        pedido.adicionarProduto(produto2);
        pedido.definirMetodoPagamento(pagamento);


        Cliente cliente = new Cliente("João", "cliente@exemplo.com");
        System.out.println("Cliente: " + cliente.getNome());
        pedido.finalizarPedido();
    }
}
