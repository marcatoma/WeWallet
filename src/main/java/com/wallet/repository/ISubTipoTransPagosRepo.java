package com.wallet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wallet.models.TipoTransaccionPagos;

@Repository
public interface ISubTipoTransPagosRepo extends JpaRepository<TipoTransaccionPagos, Long> {

}
