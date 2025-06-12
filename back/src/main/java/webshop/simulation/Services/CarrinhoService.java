package webshop.simulation.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webshop.simulation.Models.Carrinho;
import webshop.simulation.Repository.CarrinhoRepository;

import java.util.List;
@Service
public class CarrinhoService {

    @Autowired
    private CarrinhoRepository carrinhoRepository;

    public Carrinho adicionarAoCarrinho(Carrinho item) {
        return carrinhoRepository.save(item);
    }

    public List<Carrinho> listarCarrinhoPorUsuario(Long usuarioId) {
        return carrinhoRepository.findByUsuarioId(usuarioId);
    }

    public void removerItem(Long id) {
        carrinhoRepository.deleteById(id);
    }

    public void limparCarrinho(List<Carrinho> itens) {
        carrinhoRepository.deleteAll(itens);
    }
}
