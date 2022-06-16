package com.wallet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wallet.models.Transaccion;

@Repository
public interface ITrasaccionRepo extends JpaRepository<Transaccion, Long> {

	
	
}
