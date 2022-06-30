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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wallet.models.TipoTransaccion;
import com.wallet.models.Transaccion;
import com.wallet.service.TransaccionService;

@RestController
@RequestMapping("/transaction/")
@CrossOrigin("")
public class TransaccionController {

	@Autowired private TransaccionService transService;
	
	@PostMapping("new-trans")
	public ResponseEntity<?> RegistrarTransaccion(@RequestBody Transaccion transaccion){
		Map<String, Object> response=new HashMap<>();
		
		try {
			transService.SaveTrans(transaccion);
			response.put("mensaje", "Transaccion exitosa.");
		} catch (DataAccessException e) {
			response.put("mensaje", e.getMostSpecificCause().getMessage());
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
	}
	
	@GetMapping("trans")
	public ResponseEntity<?> ObtenerTransacciones(){
		Map<String, Object> response=new HashMap<>();
		
		try {
			List<Transaccion> trans=transService.FindAllTrans();
			response.put("mensaje", "transacciones obtenidas");
			response.put("result", trans);
		} catch (DataAccessException e) {
			response.put("mensaje", e.getMostSpecificCause().getMessage());
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
	}
	
	@GetMapping("type-transaction")
	public ResponseEntity<?> ObtenerTipoTransacciones(){
		Map<String, Object> response=new HashMap<>();
		try {
			List<TipoTransaccion> tipoTrans=transService.FindAllTypeTransactions();
			response.put("mensaje", "tipo de transacciones obtenidos");
			response.put("result", tipoTrans);
		} catch (DataAccessException e) {
			response.put("mensaje", e.getMostSpecificCause().getMessage());
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
	}
	
}
