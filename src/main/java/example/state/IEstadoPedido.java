package example.state;

public interface IEstadoPedido {
    String avancar(Pedido pedido);
    String cancelar(Pedido pedido);
    String getNome();
}
