package com.javatpoint.springbootexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javatpoint.springbootexample.model.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long>{

	
}
