package example.state;

public class EstadoPendente implements IEstadoPedido {

    @Override
    public String avancar(Pedido pedido) {
        pedido.setEstado(new EstadoPago());
        return "Pagamento confirmado, pedido pago.";
    }

    @Override
    public String cancelar(Pedido pedido) {
        pedido.setEstado(new EstadoCancelado());
        return "Pedido cancelado.";
    }

    @Override
    public String getNome() {
        return "Pendente";
    }
}
