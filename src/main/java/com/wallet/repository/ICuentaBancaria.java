package com.wallet.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wallet.models.CuentaBancaria;
@Repository
public interface ICuentaBancaria extends JpaRepository<CuentaBancaria, Long>{
	
	@Query(value = "SELECT * FROM cuenta_bancaria cb WHERE cb.id IN (SELECT cbu.cuenta_bancaria_id FROM cuenta_bancaria_usuario cbu WHERE cbu.usuario_id=:idUser)", nativeQuery = true)
	public List<CuentaBancaria> userAccounts(Long idUser);
	
	
}
