package com.wallet.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wallet.models.CuentaBancaria;
import com.wallet.service.CuentaBancariaService;

@RestController
@RequestMapping("/cuentabancaria/")
@CrossOrigin("*")
public class CuentaBancariaController {

	@Autowired
	CuentaBancariaService cuentaService;

	@GetMapping("useraccounts/{userid}")
	public ResponseEntity<?> ObtenerCuentasBancariasUsuario(@PathVariable long userid) {
		Map<String, Object> response = new HashMap<>();

		try {
			List<CuentaBancaria> lcb = cuentaService.GetUserAccounts(userid);
			response.put("mensaje", "lista de cuentas de usuario obtenidas");
			response.put("content", lcb);
		} catch (DataAccessException e) {
			response.put("mensaje", e.getMostSpecificCause().getMessage());
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
		}

		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
	}

}
