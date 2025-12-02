public class Main {

    public static void main(String[] args) {

        Pedido p1 = new Pedido(1, "João", "Notebook Gamer", 4999.90);
        Pedido p2 = new Pedido(2, "Maria", "Livro de POO", 89.90);

        PedidoFacade facade = new PedidoFacade();

        facade.processarPedido(p1);
        facade.processarPedido(p2);
    }
}
