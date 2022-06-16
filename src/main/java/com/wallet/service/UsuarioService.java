package com.wallet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wallet.models.Usuario;
import com.wallet.repository.IUsuarioRepo;

@Service
public class UsuarioService {

	@Autowired
	IUsuarioRepo usuarioRepo;

	@Transactional
	public Usuario SaveUsuario(Usuario user) {
		return usuarioRepo.save(user);
	}

	@Transactional(readOnly = true)
	public Usuario FindByUsername(String username) {
		return usuarioRepo.findByUsername(username);
	}

}
