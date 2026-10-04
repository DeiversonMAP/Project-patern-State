package example.state;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstadoPagoTest {

    @Test
    void deveAvancarParaEnviado() {
        Pedido pedido = new Pedido();
        pedido.setEstado(new EstadoPago());

        String mensagem = pedido.avancar();

        assertEquals("Pedido enviado.", mensagem);
        assertEquals("Enviado", pedido.getEstadoAtual());
    }

    @Test
    void deveCancelarParaCanceladoComAvisoDeEstorno() {
        Pedido pedido = new Pedido();
        pedido.setEstado(new EstadoPago());

        String mensagem = pedido.cancelar();

        assertEquals("Pedido cancelado apos o pagamento, estorno necessario.", mensagem);
        assertEquals("Cancelado", pedido.getEstadoAtual());
    }
}
