package com.example.pedidos.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pedidos.model.Pedido;
import com.example.pedidos.repository.PedidoRepository;
import com.example.pedidos.webclient.ClienteClient;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;
    
    @Autowired
    private ClienteClient clienteClient;

    public List<Pedido> findAll() {
        return pedidoRepository.findAll();
    }

    public Pedido save(Pedido pedido) {
        // Validar que el cliente exista consultando al cliente-service
        Map<String, Object> cliente = clienteClient.getClienteById(pedido.getClienteId());
        if (cliente == null || cliente.isEmpty()) {
            throw new RuntimeException("Cliente no encontrado. No se puede guardar el pedido.");
        }
        return pedidoRepository.save(pedido);
    }

}
