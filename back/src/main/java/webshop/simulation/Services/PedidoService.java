package webshop.simulation.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webshop.simulation.Models.Pedido;
import webshop.simulation.Repository.PedidoRepository;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido finalizarPedido(Pedido pedido) {
        pedido.setData(LocalDateTime.now());
        return pedidoRepository.save(pedido);
    }

    public List<Pedido> listarPedidosDoUsuario(Long usuarioId) {
        return pedidoRepository.findByUsuarioId(usuarioId);
    }
}
