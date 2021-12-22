package com.cibertec.servidor.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.servidor.entity.Auto;
import com.cibertec.servidor.service.AutoService;

@RestController
@RequestMapping("/ES-Chavez-Palomino")
public class AutoController {
	@Autowired
	private AutoService autoService;
	
	@GetMapping("/listar")
	public List<Auto> listar(){
		return autoService.listAll();
	}
	@GetMapping("/get/auto/{parametro1}")
	public List<Auto> consulta(@PathVariable("parametro1") String placa){
		return autoService.AutoxPlaca(placa);
	}
	
}
