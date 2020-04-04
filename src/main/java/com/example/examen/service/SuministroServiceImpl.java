package com.example.examen.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examen.domain.Bodega;
import com.example.examen.domain.Suministro;
import com.example.examen.repository.SuministroRepository;

@Service
public class SuministroServiceImpl implements SuministroService{

	@Autowired
	SuministroRepository suministroRepo;
	
	
	@Override
	public void saveSuministro(Suministro newSuministro) {
		suministroRepo.save(newSuministro);
	}

	@Override
	public List<Suministro> getAllSuministros() {
		return suministroRepo.findAll();
	}
	
	@Override
	public List<Suministro> getSuministrosByBodega(String bodega) {
		if(bodega.equals("todas")) {
			return suministroRepo.findAll();	
		}
		List<Suministro> suministros = new ArrayList<>();
		for(Suministro s: getAllSuministros()) {
			if(s.getBodega().equals(bodega)) {
				suministros.add(s);
			}
		}
		return suministros;
	}


}
