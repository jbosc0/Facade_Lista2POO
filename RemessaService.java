public class RemessaService {

    public void gerarRemessa(Pedido pedido) {
        System.out.println("[Remessa] Preparando envio do pedido...");
        System.out.println("[Remessa] Código de rastreio gerado: RX" + pedido.getId() + "BR");
        pedido.setStatus("ENVIADO");
    }
}
