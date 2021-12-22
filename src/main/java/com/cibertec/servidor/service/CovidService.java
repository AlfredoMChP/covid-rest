package com.cibertec.servidor.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cibertec.servidor.entity.Covid;
import com.cibertec.servidor.repository.CovidDAO;

@Service
public class CovidService {
	@Autowired
	private CovidDAO covidDAO;
	
	public void registrar(Covid bean) {
		covidDAO.save(bean);
	}
	public List<Covid> listAll(){
		return covidDAO.findAll();
	}
	public Optional<Covid> CovidxPais(String id){
		return covidDAO.CovidxPais(id);
	}
}
