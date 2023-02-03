package com.wallet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wallet.models.TipoTransaccionPagos;
import com.wallet.repository.ISubTipoTransPagosRepo;

@Service
public class TipoTransPagosService {

	@Autowired
	private ISubTipoTransPagosRepo transPagosRepo;

	@Transactional(readOnly = true)
	public List<TipoTransaccionPagos> getAllSubTransPagos() {
		return transPagosRepo.findAll();
	}

}
