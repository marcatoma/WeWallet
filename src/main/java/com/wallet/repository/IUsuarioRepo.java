package com.wallet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wallet.models.Usuario;

@Repository
public interface IUsuarioRepo extends JpaRepository<Usuario, Long> {

	Usuario findByUsername(String username);

}
