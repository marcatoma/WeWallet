package com.wallet.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wallet.models.CuentaBancaria;
import com.wallet.models.TipoTransaccion;
import com.wallet.models.Transaccion;

@Repository
public interface ITrasaccionRepo extends JpaRepository<Transaccion, Long> {

	@Query(value = "from TipoTransaccion")
	public List<TipoTransaccion> findAllTransactions();
	
	public List<Transaccion> findByCuentaBancaria(CuentaBancaria cuentaBancaria);
	
}
