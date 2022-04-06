package com.hospital.jut.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.jut.model.Model;



public interface Repository extends JpaRepository<Model, Long> {
	List<Model> findByDate(String date);

}
