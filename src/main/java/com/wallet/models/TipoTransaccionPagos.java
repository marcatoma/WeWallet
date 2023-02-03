package com.wallet.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.wallet.enums.ETipoPagos;

@Entity
@Table(name = "sub_tipo_trans_pagos")
public class TipoTransaccionPagos implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_sub_tipo_trans_pagos;

	@Enumerated(EnumType.STRING)
	private ETipoPagos tipoPago;

	public Long getId_sub_tipo_trans_pagos() {
		return id_sub_tipo_trans_pagos;
	}

	public void setId_sub_tipo_trans_pagos(Long id_sub_tipo_trans_pagos) {
		this.id_sub_tipo_trans_pagos = id_sub_tipo_trans_pagos;
	}

	public ETipoPagos getTipoPago() {
		return tipoPago;
	}

	public void setTipoPago(ETipoPagos tipoPago) {
		this.tipoPago = tipoPago;
	}

	private static final long serialVersionUID = 1L;

}
