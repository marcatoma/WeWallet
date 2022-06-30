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
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.wallet.enums.ETipoTrans;

@Entity
@Table(name = "tipo_transaccion")
public class TipoTransaccion implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "El valor no puede ser nulo.")
	@NotEmpty(message = "El valor no puede estar vacío.")
	@Enumerated(EnumType.STRING)
	private ETipoTrans tipoTrans;

	@Column(name = "signo")
	private String signo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ETipoTrans getTipoTrans() {
		return tipoTrans;
	}

	public void setTipoTrans(ETipoTrans tipoTrans) {
		this.tipoTrans = tipoTrans;
	}

	public String getSigno() {
		return signo;
	}

	public void setSigno(String signo) {
		this.signo = signo;
	}

	private static final long serialVersionUID = 1L;

}
