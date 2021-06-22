package com.spring.boot.aplicacionjava.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.aplicacionjava.models.entity.Cliente;


public interface IClienteRepository extends JpaRepository<Cliente, Long>{

}
