package com.shoe.platform.service;

import java.util.Optional;

import com.shoe.platform.model.Usuario;

public interface IUsuarioService {
	
	Optional<Usuario> findById(Integer id);
	
}
