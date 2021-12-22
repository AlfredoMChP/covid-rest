package com.cibertec.servidor.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cibertec.servidor.entity.Covid;

public interface CovidDAO extends JpaRepository<Covid, String>{
	@Query("select p from Covid p where p.id=?1")
	public Optional<Covid> CovidxPais(String id);
}
