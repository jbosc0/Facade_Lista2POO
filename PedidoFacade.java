public class PedidoFacade {

    private final EstoqueService estoqueService;
    private final PagamentoService pagamentoService;
    private final RemessaService remessaService;

    public PedidoFacade() {
        this.estoqueService = new EstoqueService();
        this.pagamentoService = new PagamentoService();
        this.remessaService = new RemessaService();
    }

    public void processarPedido(Pedido pedido) {
        System.out.println("\nPROCESSANDO PEDIDO #" + pedido.getId());

        if (!estoqueService.verificarDisponibilidade(pedido)) {
            System.out.println("[Facade] Falha: Produtos indisponíveis.");
            return;
        }

        if (!pagamentoService.processarPagamento(pedido)) {
            System.out.println("[Facade] Falha: Pagamento não aprovado.");
            return;
        }

        remessaService.gerarRemessa(pedido);

        System.out.println("[Facade] Pedido concluído com sucesso! Status final: " + pedido.getStatus());
    }
}
