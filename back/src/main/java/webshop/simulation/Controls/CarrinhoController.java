package webshop.simulation.Controls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import webshop.simulation.Models.Carrinho;
import webshop.simulation.Services.CarrinhoService;

import java.util.List;

@RestController
@RequestMapping("/carrinho")
@CrossOrigin
public class CarrinhoController {

    @Autowired
    private CarrinhoService carrinhoService;

    @PostMapping
    public Carrinho adicionar(@RequestBody Carrinho item) {
        return carrinhoService.adicionarAoCarrinho(item);
    }

    @GetMapping("/{usuarioId}")
    public List<Carrinho> listar(@PathVariable Long usuarioId) {
        return carrinhoService.listarCarrinhoPorUsuario(usuarioId);
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable Long id) {
        carrinhoService.removerItem(id);
    }
}
