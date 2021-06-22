package com.spring.boot.aplicacionjava.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.aplicacionjava.models.entity.Ciudad;

public interface ICiudadRepository extends JpaRepository<Ciudad, Long>{

}
