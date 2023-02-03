package com.wallet.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "credito")
public class Credito implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_credito;
	private Double cantidad_a_deber;
	private Double cantidad_pagada;
	private String descripcion;
	private boolean pagado;
	private Date createAt;

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@JoinColumn(name = "prestador_id")
	private PrestadorDeudor prestador;

	@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler", "credito", "tipoTrans", "usuario",
			"cuentaBancaria" }, allowSetters = true)
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "credito")
	private List<Transaccion> transacciones;

	public Long getId_credito() {
		return id_credito;
	}

	public void setId_credito(Long id_credito) {
		this.id_credito = id_credito;
	}

	public Double getCantidad_a_deber() {
		return cantidad_a_deber;
	}

	public void setCantidad_a_deber(Double cantidad_a_deber) {
		this.cantidad_a_deber = cantidad_a_deber;
	}

	public Double getCantidad_pagada() {
		return cantidad_pagada;
	}

	public void setCantidad_pagada(Double cantidad_pagada) {
		this.cantidad_pagada = cantidad_pagada;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public PrestadorDeudor getPrestador() {
		return prestador;
	}

	public void setPrestador(PrestadorDeudor prestador) {
		this.prestador = prestador;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public boolean isPagado() {
		return pagado;
	}

	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	}

	public List<Transaccion> getTransacciones() {
		return transacciones;
	}

	public void setTransacciones(List<Transaccion> transacciones) {
		this.transacciones = transacciones;
	}

	private static final long serialVersionUID = 1L;

}
