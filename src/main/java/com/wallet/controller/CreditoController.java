package com.wallet.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wallet.models.Credito;
import com.wallet.service.CreditoService;

@RestController
@RequestMapping("/credito/")
@CrossOrigin("*")
public class CreditoController {

	@Autowired
	CreditoService creditoService;

	@GetMapping("")
	public ResponseEntity<?> ListarCreditos() {
		Map<String, Object> response = new HashMap<>();
		// result-mensaje
		try {
			List<Credito> prestamos = creditoService.getAllCreditos();
			response.put("result", prestamos);
			response.put("mensaje", "Lista de prestamos obtenida");
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
		} catch (DataAccessException e) {
			response.put("mensaje", e.getMostSpecificCause().getMessage());
			response.put("result", new ArrayList<>());
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
		}

	}

	@PostMapping("new-credit")
	public ResponseEntity<?> RegistrarCredito(@RequestBody Credito credito) {
		Map<String, Object> response = new HashMap<>();
		try {
			response.put("mensaje", "Credito registrado.");
			response.put("result", new ArrayList<>());
		} catch (DataAccessException e) {
			response.put("mensaje", e.getMostSpecificCause().getMessage());
			response.put("result", new ArrayList<>());
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
	}

}
