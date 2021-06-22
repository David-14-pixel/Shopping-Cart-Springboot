package com.spring.boot.aplicacionjava.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.aplicacionjava.models.entity.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long>{

}
