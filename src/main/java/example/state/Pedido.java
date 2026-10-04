package example.state;

public class Pedido {

    private IEstadoPedido estado;

    public Pedido() {
        this.estado = new EstadoPendente();
    }

    public void setEstado(IEstadoPedido estado) {
        this.estado = estado;
    }

    public String getEstadoAtual() {
        return estado.getNome();
    }

    public String avancar() {
        return estado.avancar(this);
    }

    public String cancelar() {
        return estado.cancelar(this);
    }
}
