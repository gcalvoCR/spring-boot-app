package com.example.examen.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen.domain.Suministro;
import com.example.examen.service.SuministroService;

@RestController
public class SuministroApiController {
	
	@Autowired
	SuministroService suministroService;
	
	  @GetMapping("/suministros")
	  public List<Suministro> getAllSuministros(){
		  return suministroService.getAllSuministros();
		}

}