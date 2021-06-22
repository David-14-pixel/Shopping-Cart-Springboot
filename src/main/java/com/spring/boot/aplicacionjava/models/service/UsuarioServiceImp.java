package com.spring.boot.aplicacionjava.models.service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.boot.aplicacionjava.models.entity.Cliente;
import com.spring.boot.aplicacionjava.models.entity.Direccion;
import com.spring.boot.aplicacionjava.models.entity.Rol;
import com.spring.boot.aplicacionjava.models.entity.Usuario;
import com.spring.boot.aplicacionjava.models.repository.IClienteRepository;
import com.spring.boot.aplicacionjava.models.repository.IDireccionRepository;
import com.spring.boot.aplicacionjava.models.repository.IRolRepository;
import com.spring.boot.aplicacionjava.models.repository.IUsuarioRepository;
@Service
public class UsuarioServiceImp implements IUsuarioService {
	@Autowired
	private IUsuarioRepository iusurepo;
	@Autowired
	private IClienteRepository iclienrepo;
	@Autowired
	private IRolRepository irolrepo;
	@Autowired
	private IDireccionRepository idirerepo;
	
	
	
	
	@Transactional
	public void saveUsuario(Usuario usuario, Cliente cliente, Direccion direccion) {
		Rol rol = irolrepo.findByNombre("CLIENTE");
		Set<Rol> rols = new HashSet<Rol>(Arrays.asList(rol));
		usuario.setRols(rols);
		iusurepo.save(usuario);
		cliente.setUsuario(usuario);
		iclienrepo.save(cliente);
		direccion.setCliente(cliente);
		idirerepo.save(direccion);
		
		
	}

}
