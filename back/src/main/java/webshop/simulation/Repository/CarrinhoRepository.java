package webshop.simulation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import webshop.simulation.Models.Carrinho;

import java.util.List;

public interface CarrinhoRepository extends JpaRepository<Carrinho, Long> {
    List<Carrinho> findByUsuarioId(Long usuarioId);
}
