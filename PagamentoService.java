public class PagamentoService {

    public boolean processarPagamento(Pedido pedido) {
        System.out.println("[Pagamento] Processando pagamento de R$ " + pedido.getValorTotal());

        if (pedido.getValorTotal() > 1000) {
            System.out.println("[Pagamento] Pagamento recusado.");
            return false;
        }

        System.out.println("[Pagamento] Pagamento aprovado.");
        return true;
    }
}
