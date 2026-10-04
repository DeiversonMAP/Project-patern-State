package example.state;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void deveComecarComoPendente() {
        Pedido pedido = new Pedido();
        assertEquals("Pendente", pedido.getEstadoAtual());
    }

    @Test
    void deveSeguirFluxoCompletoDePendenteAteEntregue() {
        Pedido pedido = new Pedido();

        pedido.avancar();
        assertEquals("Pago", pedido.getEstadoAtual());

        pedido.avancar();
        assertEquals("Enviado", pedido.getEstadoAtual());

        pedido.avancar();
        assertEquals("Entregue", pedido.getEstadoAtual());
    }

    @Test
    void deveCancelarAPartirDePendente() {
        Pedido pedido = new Pedido();
        pedido.cancelar();
        assertEquals("Cancelado", pedido.getEstadoAtual());
    }
}
