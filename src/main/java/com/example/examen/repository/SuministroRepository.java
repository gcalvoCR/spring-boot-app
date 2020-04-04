package com.example.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.examen.domain.Suministro;

@Repository
public interface SuministroRepository extends JpaRepository<Suministro, Integer>{

}