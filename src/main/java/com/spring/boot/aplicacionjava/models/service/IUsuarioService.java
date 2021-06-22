package com.spring.boot.aplicacionjava.models.service;

import com.spring.boot.aplicacionjava.models.entity.Cliente;
import com.spring.boot.aplicacionjava.models.entity.Direccion;
import com.spring.boot.aplicacionjava.models.entity.Usuario;

public interface IUsuarioService {
public void saveUsuario(Usuario usuario, Cliente cliente, Direccion direccion);
}
