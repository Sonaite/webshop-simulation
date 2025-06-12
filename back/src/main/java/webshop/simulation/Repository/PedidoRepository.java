package webshop.simulation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import webshop.simulation.Models.Pedido;

import java.util.List;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    List<Pedido> findByUsuarioId(Long usuarioId);
}
