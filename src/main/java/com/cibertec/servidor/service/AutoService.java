package com.cibertec.servidor.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cibertec.servidor.entity.Auto;
import com.cibertec.servidor.repository.AutoDAO;

@Service
public class AutoService {
	@Autowired
	private AutoDAO autoDAO;
	
	public void registrar(Auto bean) {
		autoDAO.save(bean);
	}
	public List<Auto> listAll(){
		return autoDAO.findAll();
	}
	public List<Auto> AutoxPlaca(String placa){
		return autoDAO.AutoxPlaca(placa);
	}
}
