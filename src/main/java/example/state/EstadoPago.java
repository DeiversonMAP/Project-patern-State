package example.state;

public class EstadoPago implements IEstadoPedido {

    @Override
    public String avancar(Pedido pedido) {
        pedido.setEstado(new EstadoEnviado());
        return "Pedido enviado.";
    }

    @Override
    public String cancelar(Pedido pedido) {
        pedido.setEstado(new EstadoCancelado());
        return "Pedido cancelado apos o pagamento, estorno necessario.";
    }

    @Override
    public String getNome() {
        return "Pago";
    }
}
