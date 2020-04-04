package com.example.examen.service;

import java.util.List;

import com.example.examen.domain.Suministro;

public interface SuministroService {
	
	public void saveSuministro(Suministro newSuministro);
	public List<Suministro> getAllSuministros();
	public List<Suministro> getSuministrosByBodega(String bodega);

}
