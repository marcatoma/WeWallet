package com.wallet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wallet.models.CuentaBancaria;
import com.wallet.repository.ICuentaBancaria;

@Service
public class CuentaBancariaService {

	@Autowired
	private ICuentaBancaria cuentaRepo;

	@Transactional
	public CuentaBancaria RegisterCuentaBancaria(CuentaBancaria cuenta) {
		return cuentaRepo.save(cuenta);
	}

	@Transactional(readOnly = true)
	public List<CuentaBancaria> GetUserAccounts(Long UserID) {
		return cuentaRepo.userAccounts(UserID);
	}

}
