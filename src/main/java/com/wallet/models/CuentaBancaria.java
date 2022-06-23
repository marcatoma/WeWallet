package com.wallet.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cuenta_bancaria")
public class CuentaBancaria implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "numero_cuenta")
	private String numeroCuenta;
	
	@Column(name = "monto_efectivo")
	private Double montoEfectivo;
	
	@Column(name = "monto_credito")
	private Double montoCredito;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "banco_id")
	private Banco banco;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "cuenta_usuario")
	private List<Usuario> usuario;
	
	private static final long serialVersionUID = 1L;

}
