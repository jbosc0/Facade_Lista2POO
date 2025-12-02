public class Pedido {

    private int id;
    private String cliente;
    private String descricaoProdutos;
    private double valorTotal;
    private String status;

    public Pedido(int id, String cliente, String descricaoProdutos, double valorTotal) {
        this.id = id;
        this.cliente = cliente;
        this.descricaoProdutos = descricaoProdutos;
        this.valorTotal = valorTotal;
        this.status = "CRIADO";
    }

    public int getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public String getDescricaoProdutos() {
        return descricaoProdutos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
