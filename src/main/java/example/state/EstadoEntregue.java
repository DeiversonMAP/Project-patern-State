package example.state;

public class EstadoEntregue implements IEstadoPedido {

    @Override
    public String avancar(Pedido pedido) {
        return "Pedido ja entregue, nao ha proximo estado.";
    }

    @Override
    public String cancelar(Pedido pedido) {
        return "Pedido ja entregue, nao pode ser cancelado.";
    }

    @Override
    public String getNome() {
        return "Entregue";
    }
}
