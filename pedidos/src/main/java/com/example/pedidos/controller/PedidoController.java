package com.example.pedidos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pedidos.model.Pedido;
import com.example.pedidos.service.PedidoService;

@RestController
@RequestMapping("/api/v1/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

     @GetMapping
    public ResponseEntity<List<Pedido>> getAllPedidos() {
        List<Pedido> lista2 = pedidoService.findAll();

        if(lista2.isEmpty()){
            //si esta vacia devuelvo un codigo not_content
            return ResponseEntity.noContent().build();
        }
        //si la lista tiene registros
        return ResponseEntity.ok(lista2);
    }

    @PostMapping
    public ResponseEntity<?> createPedido(@RequestBody Pedido pedido) {
        try {
            Pedido savedPedido = pedidoService.save(pedido);
            return ResponseEntity.status(201).body(savedPedido);
        } catch (RuntimeException e) {
            return ResponseEntity.status(404).body(e.getMessage());
        }
        //return ResponseEntity.status(201).body(pedidoService.save(pedido));
    }
}
