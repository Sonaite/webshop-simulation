package webshop.simulation.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webshop.simulation.Models.Produto;
import webshop.simulation.Repository.ProdutoRepository;

import java.util.List;
import java.util.Optional;
@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }

    public Produto salvar(Produto produto) {
        return produtoRepository.save(produto);
    }

    public Optional<Produto> buscarPorId(Long id) {
        return produtoRepository.findById(id);
    }

    public void excluir(Long id) {
        produtoRepository.deleteById(id);
    }
}
