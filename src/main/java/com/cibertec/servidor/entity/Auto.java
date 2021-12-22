package com.cibertec.servidor.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "auto")

public class Auto {
	@Id
	@Column(name = "placa")
	private String placa;
	
	@Column(name = "marca")
	private String marca;
	
	@Column(name = "modelo")
	private String modelo;
	
	@Column(name = "año")
	private String año;
	
	@Column(name = "papeletas")
	private int papeletas;

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAño() {
		return año;
	}

	public void setAño(String año) {
		this.año = año;
	}

	public int getPapeletas() {
		return papeletas;
	}

	public void setPapeletas(int papeletas) {
		this.papeletas = papeletas;
	}
	
}
