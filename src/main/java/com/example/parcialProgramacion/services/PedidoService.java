package com.example.parcialProgramacion.services;


import com.example.parcialProgramacion.entities.DetallePedido;
import com.example.parcialProgramacion.entities.Factura;
import com.example.parcialProgramacion.entities.Pedido;
import com.example.parcialProgramacion.repositories.FacturaRepository;
import com.example.parcialProgramacion.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PedidoService extends BaseService<Pedido, Long>{

    @Autowired
    private PedidoRepository pedidoRepository;
    @Autowired
    private DetallePedidoService detallePedidoService;

    public PedidoService(PedidoRepository pedidoRepository){
        super(pedidoRepository);
    }

    @Transactional
    public Pedido calcularTotal(Pedido pedido) throws Exception {
        try{

            List<DetallePedido> detallePedidos = detallePedidoService.listarPorPedido(pedido.getId());
            Double total = 0.0;

            if (detallePedidos != null && !detallePedidos.isEmpty()) {
                total = detallePedidos.stream()
                        .mapToDouble(detalle -> detalle.getSubTotal())
                        .sum();
            }

            pedido.setTotal(total);
            return pedidoRepository.save(pedido);

        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    @Transactional
    public Pedido actualizar(Pedido pedido) throws Exception {
        try{
            calcularTotal(pedido);
            return pedidoRepository.save(pedido);
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }


    @Transactional
    public List<Pedido> getPedidosByClienteId(Long clienteId) throws Exception{
        try {
            return pedidoRepository.findByclienteId(clienteId);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<Pedido> getPedidosByEmpleadoId(Long empleadoId) throws Exception{
        try {
            return pedidoRepository.findByempleadoId(empleadoId);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<Pedido> getPedidosBySucursalId(Long sucursalId) throws Exception{
        try {
            return pedidoRepository.findBysucursalId(sucursalId);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
