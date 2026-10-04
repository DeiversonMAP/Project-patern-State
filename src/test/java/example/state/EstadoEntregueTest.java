package example.state;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstadoEntregueTest {

    @Test
    void naoDeveAvancarAposEntregue() {
        Pedido pedido = new Pedido();
        pedido.setEstado(new EstadoEntregue());

        String mensagem = pedido.avancar();

        assertEquals("Pedido ja entregue, nao ha proximo estado.", mensagem);
        assertEquals("Entregue", pedido.getEstadoAtual());
    }

    @Test
    void naoDeveCancelarAposEntregue() {
        Pedido pedido = new Pedido();
        pedido.setEstado(new EstadoEntregue());

        String mensagem = pedido.cancelar();

        assertEquals("Pedido ja entregue, nao pode ser cancelado.", mensagem);
        assertEquals("Entregue", pedido.getEstadoAtual());
    }
}
