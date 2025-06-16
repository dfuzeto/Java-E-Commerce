package Pagamento;

public class Paypal implements Pagamento{

    String email;

    public Paypal(String email) {
        this.email = email;
    }

    @Override
    public boolean processarPagamento(double valor) {
        System.out.println("Pagamento de " + valor + "R$ realizado com sucesso!");
        return true;
    }
}
