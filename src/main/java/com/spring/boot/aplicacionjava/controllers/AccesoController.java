package com.spring.boot.aplicacionjava.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.boot.aplicacionjava.models.entity.Cliente;
import com.spring.boot.aplicacionjava.models.entity.Direccion;
import com.spring.boot.aplicacionjava.models.entity.Municipio;
import com.spring.boot.aplicacionjava.models.entity.Usuario;
import com.spring.boot.aplicacionjava.models.repository.ICiudadRepository;
import com.spring.boot.aplicacionjava.models.repository.IMunicipioDao;
import com.spring.boot.aplicacionjava.models.service.IUsuarioService;

import ch.qos.logback.core.net.server.Client;

@Controller
public class AccesoController { 
	@Autowired
	private IUsuarioService iususer;
	@Autowired
	private IMunicipioDao munidao;
	@Autowired
	private ICiudadRepository ciuddao;
@GetMapping("/registro")
public String registro(Model model) {
	model.addAttribute("usuario", new Usuario());
	model.addAttribute("cliente", new Cliente());
	model.addAttribute("direccion", new Direccion());
	model.addAttribute("municipios", munidao.findAll());
	model.addAttribute("ciudades", ciuddao.findAll());
	return "frontend/acceso/registro";
}
@PostMapping("/registrandose")
public String registrandose(Usuario usuario, Cliente cliente, Direccion direccion) {
	iususer.saveUsuario(usuario, cliente, direccion);
	return "redirect:/registro";
}
@GetMapping("/obtener_municipios/{id}")
@ResponseBody
public List<Municipio> obtener_municipios(@PathVariable Long id){
	return munidao.consultarMunicipios(id);
}
}
