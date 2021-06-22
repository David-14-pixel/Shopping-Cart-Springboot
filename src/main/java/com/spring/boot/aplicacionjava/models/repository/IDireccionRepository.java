package com.spring.boot.aplicacionjava.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.aplicacionjava.models.entity.Direccion;

public interface IDireccionRepository extends JpaRepository<Direccion, Long>{

}
