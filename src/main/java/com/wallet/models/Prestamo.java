package com.wallet.models;

import java.io.Serializable;
import java.util.Date;

public class Prestamo implements Serializable{

	private Long id;
	
	private PrestadorDeudor deudor;
	
	private Double cantidad;
	
	private Double interes;
	
	private String detalle;
	
	private Date createAt;
	
	private static final long serialVersionUID = 1L;

}
