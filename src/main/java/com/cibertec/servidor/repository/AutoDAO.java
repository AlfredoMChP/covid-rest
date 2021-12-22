package com.cibertec.servidor.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cibertec.servidor.entity.Auto;

public interface AutoDAO extends JpaRepository<Auto, String>{
	@Query("select p from Auto p where p.placa=?1")
	public List<Auto> AutoxPlaca(String placa);
}
