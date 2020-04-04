package com.example.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.examen.domain.Bodega;

@Repository
public interface BodegaRepository extends JpaRepository<Bodega, String>{

}