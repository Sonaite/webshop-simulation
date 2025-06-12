package webshop.simulation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import webshop.simulation.Models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
