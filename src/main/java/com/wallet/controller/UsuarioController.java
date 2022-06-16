package com.wallet.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wallet.models.Usuario;
import com.wallet.service.UsuarioService;

@RestController
@CrossOrigin("*")
@RequestMapping("/usuario/")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@PostMapping("new")
	public ResponseEntity<?> RegistrarUsuario(@RequestBody Usuario usuario) {
		Map<String, Object> response = new HashMap<>();
		try {
			usuarioService.SaveUsuario(usuario);
			response.put("mensaje", "Usuario creado");
		} catch (DataAccessException e) {
			response.put("mensaje", e.getMostSpecificCause().getMessage());
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
	}

	@GetMapping("{username}")
	public ResponseEntity<?> ObtenerUsuarioUsername(@PathVariable String username) {
		Map<String, Object> response = new HashMap<>();
		try {
			Usuario user = usuarioService.FindByUsername(username);

			response.put("mensaje", user == null ? "El usuario: " + username + " no existe" : "Usuario Encontrado");
			response.put("result", user);
		} catch (DataAccessException e) {
			response.put("mensaje", e.getMostSpecificCause().getMessage());
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
	}

}
