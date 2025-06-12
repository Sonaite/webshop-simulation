package webshop.simulation.Controls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import webshop.simulation.Models.Pedido;
import webshop.simulation.Services.PedidoService;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
@CrossOrigin
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    public Pedido finalizar(@RequestBody Pedido pedido) {
        return pedidoService.finalizarPedido(pedido);
    }

    @GetMapping("/{usuarioId}")
    public List<Pedido> listar(@PathVariable Long usuarioId) {
        return pedidoService.listarPedidosDoUsuario(usuarioId);
    }
}
