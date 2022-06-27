package com.wallet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wallet.models.Banco;

@Repository
public interface IBancoRepo extends JpaRepository<Banco, Long> {

}
