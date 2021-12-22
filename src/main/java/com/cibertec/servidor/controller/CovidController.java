package com.cibertec.servidor.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.servidor.entity.Covid;
import com.cibertec.servidor.service.CovidService;

@RestController
@RequestMapping("/v1")
public class CovidController {
	@Autowired
	private CovidService covidService;
	
	@GetMapping("/listar")
	public List<Covid> listar(){
		return covidService.listAll();
	}
	@GetMapping("/pais/{parametro1}")
	public Optional<Covid> consulta(@PathVariable("parametro1") String id){
		return covidService.CovidxPais(id);
	}
	
}
