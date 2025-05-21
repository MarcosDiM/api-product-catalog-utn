package com.example.parcialProgramacion.controllers;

import com.example.parcialProgramacion.entities.Factura;
import com.example.parcialProgramacion.entities.Pedido;
import com.example.parcialProgramacion.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pedidos")
public class PedidoController extends BaseController<Pedido, Long> {

    @Autowired
    private PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService){
        super(pedidoService);
    }

    @PutMapping("/total")
    public Optional<Pedido> calcularTotal(@RequestBody Pedido pedido) throws Exception {
        Pedido pedido_aux = pedidoService.calcularTotal(pedido);
        return Optional.ofNullable(pedido_aux);
    }

    @GetMapping("/cliente/{clienteId}")
    public List<Pedido> getPedidoByClienteId(@PathVariable Long clienteId) throws Exception {
        return pedidoService.getPedidosByClienteId(clienteId);
    }

    @GetMapping("/empleado/{empleadoId}")
    public List<Pedido> getPedidoByEmpleadoId(@PathVariable Long empleadoId) throws Exception{
        return pedidoService.getPedidosByEmpleadoId(empleadoId);
    }

    @GetMapping("/sucursal/{sucursalId}")
    public List<Pedido> getPedidoBySucursalId(@PathVariable Long sucursalId) throws Exception{
        return pedidoService.getPedidosBySucursalId(sucursalId);
    }

}
