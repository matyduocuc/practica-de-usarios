package com.example.clientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.clientes.model.Cliente;

@Repository
public interface ClienteRespository extends JpaRepository<Cliente, Long>{

}
