package com.wallet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wallet.models.TipoTransaccion;

@Repository
public interface ITipoTransaccionRepo extends JpaRepository<TipoTransaccion, Long> {

}
