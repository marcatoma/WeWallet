package com.wallet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wallet.models.Banco;
import com.wallet.repository.IBancoRepo;

@Service
public class BancoService {

	@Autowired IBancoRepo bancoRepo;
	
	public List<Banco> GetAllBancos; 
	
}
