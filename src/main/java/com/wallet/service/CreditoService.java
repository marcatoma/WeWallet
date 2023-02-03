package com.wallet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wallet.models.Credito;
import com.wallet.repository.ICreditoRepo;

@Service
public class CreditoService {

	private @Autowired ICreditoRepo creditoRepo;
	
	@Transactional
	public Credito newCredit(Credito credito) {
		return creditoRepo.save(credito);
	}
	
	@Transactional(readOnly = true)
	public List<Credito> getAllCreditos(){
		return creditoRepo.findAll();
	}
	
}
