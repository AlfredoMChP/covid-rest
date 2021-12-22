package com.cibertec.servidor.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "covid")

public class Covid {
	@Id
	@Column(name = "id")
	private String id;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "Last_Update")
	private String Last_Update;
	
	@Column(name = "Total_Cases_text")
	private String Total_Cases_text;
	
	@Column(name = "Total_Deaths_text")
	private String Total_Deaths_text;
	
	@Column(name = "Total_Recovered_text")
	private String Total_Recovered_text;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLast_Update() {
		return Last_Update;
	}

	public void setLast_Update(String last_Update) {
		Last_Update = last_Update;
	}

	public String getTotal_Cases_text() {
		return Total_Cases_text;
	}

	public void setTotal_Cases_text(String total_Cases_text) {
		Total_Cases_text = total_Cases_text;
	}

	public String getTotal_Deaths_text() {
		return Total_Deaths_text;
	}

	public void setTotal_Deaths_text(String total_Deaths_text) {
		Total_Deaths_text = total_Deaths_text;
	}

	public String getTotal_Recovered_text() {
		return Total_Recovered_text;
	}

	public void setTotal_Recovered_text(String total_Recovered_text) {
		Total_Recovered_text = total_Recovered_text;
	}

	
	
}
