package example.state;

public class EstadoEnviado implements IEstadoPedido {

    @Override
    public String avancar(Pedido pedido) {
        pedido.setEstado(new EstadoEntregue());
        return "Pedido entregue.";
    }

    @Override
    public String cancelar(Pedido pedido) {
        return "Pedido ja enviado, nao pode mais ser cancelado.";
    }

    @Override
    public String getNome() {
        return "Enviado";
    }
}
