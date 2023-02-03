package com.wallet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wallet.models.Credito;

@Repository
public interface ICreditoRepo extends JpaRepository<Credito, Long> {

}
