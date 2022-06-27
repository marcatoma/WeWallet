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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "cuenta_bancaria")
@JsonIgnoreProperties({"usuario"})
public class CuentaBancaria implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "numero_cuenta", unique = true)
	private String numeroCuenta;

	@Column(name = "monto_efectivo")
	private Double montoEfectivo;

	@Column(name = "monto_credito")
	private Double montoCredito;

	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "banco_id")
	private Banco banco;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "cuenta_usuario")
	private List<Usuario> usuario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public Double getMontoEfectivo() {
		return montoEfectivo;
	}

	public void setMontoEfectivo(Double montoEfectivo) {
		this.montoEfectivo = montoEfectivo;
	}

	public Double getMontoCredito() {
		return montoCredito;
	}

	public void setMontoCredito(Double montoCredito) {
		this.montoCredito = montoCredito;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public List<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(List<Usuario> usuario) {
		this.usuario = usuario;
	}

	private static final long serialVersionUID = 1L;

}
