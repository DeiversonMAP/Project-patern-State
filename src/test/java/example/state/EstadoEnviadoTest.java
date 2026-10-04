package example.state;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstadoEnviadoTest {

    @Test
    void deveAvancarParaEntregue() {
        Pedido pedido = new Pedido();
        pedido.setEstado(new EstadoEnviado());

        String mensagem = pedido.avancar();

        assertEquals("Pedido entregue.", mensagem);
        assertEquals("Entregue", pedido.getEstadoAtual());
    }

    @Test
    void naoDeveCancelarPedidoJaEnviado() {
        Pedido pedido = new Pedido();
        pedido.setEstado(new EstadoEnviado());

        String mensagem = pedido.cancelar();

        assertEquals("Pedido ja enviado, nao pode mais ser cancelado.", mensagem);
        assertEquals("Enviado", pedido.getEstadoAtual());
    }
}
