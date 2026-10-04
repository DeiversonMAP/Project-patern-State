package example.state;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstadoPendenteTest {

    @Test
    void deveAvancarParaPago() {
        Pedido pedido = new Pedido();
        String mensagem = pedido.avancar();

        assertEquals("Pagamento confirmado, pedido pago.", mensagem);
        assertEquals("Pago", pedido.getEstadoAtual());
    }

    @Test
    void deveCancelarParaCancelado() {
        Pedido pedido = new Pedido();
        String mensagem = pedido.cancelar();

        assertEquals("Pedido cancelado.", mensagem);
        assertEquals("Cancelado", pedido.getEstadoAtual());
    }
}
