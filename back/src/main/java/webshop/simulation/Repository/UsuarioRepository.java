package webshop.simulation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import webshop.simulation.Models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByEmail(String email);
}
