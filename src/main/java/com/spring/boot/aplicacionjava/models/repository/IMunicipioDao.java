package com.spring.boot.aplicacionjava.models.repository;

import java.util.Iterator;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.spring.boot.aplicacionjava.models.entity.Municipio;

public interface IMunicipioDao extends JpaRepository<Municipio, Long>{
@Query("SELECT m From Municipio m where m.ciudad.id=?1")
public List<Municipio> consultarMunicipios(Long id);

}
