package com.wallet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wallet.models.TipoTransaccion;
import com.wallet.repository.ITipoTransaccionRepo;

@Service
public class TipoTransaccionService {

	@Autowired ITipoTransaccionRepo transRepo;
	@Transactional
	public TipoTransaccion SaveTypeTrans(TipoTransaccion trans) {
		return transRepo.save(trans);
	}
	
}
