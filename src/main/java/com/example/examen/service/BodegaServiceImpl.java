package com.example.examen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examen.domain.Bodega;
import com.example.examen.repository.BodegaRepository;


@Service
public class BodegaServiceImpl implements BodegaService{
	
	@Autowired
	BodegaRepository bodegaRepo;
	
	@Override
	public List<Bodega> getAllBodegas() {
		return bodegaRepo.findAll();
	}

}
