package com.wallet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wallet.models.TipoTransaccion;
import com.wallet.models.Transaccion;
import com.wallet.repository.ITrasaccionRepo;

@Service
public class TransaccionService {

	@Autowired
	ITrasaccionRepo transRepo;

	@Transactional
	public Transaccion SaveTrans(Transaccion transaccion) {
		return transRepo.save(transaccion);
	}

	@Transactional(readOnly = true)
	public List<Transaccion> FindAllTrans() {
		return transRepo.findAll();
	}
	
	@Transactional(readOnly = true)
	public List<TipoTransaccion> FindAllTypeTransactions(){
		return transRepo.findAllTransactions();
	}

}
