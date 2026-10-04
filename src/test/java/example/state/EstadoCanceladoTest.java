package example.state;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstadoCanceladoTest {

    @Test
    void naoDeveAvancarPedidoCancelado() {
        Pedido pedido = new Pedido();
        pedido.setEstado(new EstadoCancelado());

        String mensagem = pedido.avancar();

        assertEquals("Pedido cancelado, nao pode avancar.", mensagem);
        assertEquals("Cancelado", pedido.getEstadoAtual());
    }

    @Test
    void naoDeveCancelarDeNovo() {
        Pedido pedido = new Pedido();
        pedido.setEstado(new EstadoCancelado());

        String mensagem = pedido.cancelar();

        assertEquals("Pedido ja esta cancelado.", mensagem);
        assertEquals("Cancelado", pedido.getEstadoAtual());
    }
}
