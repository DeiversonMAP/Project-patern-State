package example.state;

public class EstadoCancelado implements IEstadoPedido {

    @Override
    public String avancar(Pedido pedido) {
        return "Pedido cancelado, nao pode avancar.";
    }

    @Override
    public String cancelar(Pedido pedido) {
        return "Pedido ja esta cancelado.";
    }

    @Override
    public String getNome() {
        return "Cancelado";
    }
}
