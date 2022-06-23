package com.wallet.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.wallet.enums.ETipoCuenta;

@Entity
@Table(name = "tipo_cuenta")
public class TipoCuenta implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "tipo")
	@Enumerated(EnumType.STRING)
	private ETipoCuenta tipo; 
	
	private static final long serialVersionUID = 1L;

}
