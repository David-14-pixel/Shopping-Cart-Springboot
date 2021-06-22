package com.spring.boot.aplicacionjava.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.aplicacionjava.models.entity.Rol;

public interface IRolRepository extends JpaRepository<Rol, Long>{
Rol findByNombre(String nombre);
}
