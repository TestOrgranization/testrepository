package com.javatpoint.springbootexample.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.javatpoint.springbootexample.model.City;
import com.javatpoint.springbootexample.repository.CityRepository;

@Service
public class CityService implements CityRepository {

	@Autowired
	CityRepository cityRepository;

	@Override
	public long count() {
		return 0;
	}

	@Override
	public void delete(City arg0) {
	}

	@Override
	public void deleteAll() {
	}

	@Override
	public void deleteAll(Iterable<? extends City> arg0) {
	}

	@Override
	public void deleteById(Long arg0) {
	}

	@Override
	public boolean existsById(Long arg0) {
		return false;
	}


	@Override
	public Optional<City> findById(Long arg0) {
		return null;
	}

	@Override
	public <S extends City> S save(S arg0) {
		return null;
	}

	@Override
	public void deleteAllInBatch() {
	}

	@Override
	public void deleteInBatch(Iterable<City> arg0) {
	}

	@Override
	public List<City> findAll() {
		List<City> cityList= cityRepository.findAll();
		return cityList;
	}

	@Override
	public List<City> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends City> List<S> findAll(Example<S> arg0) {
		return null;
	}

	@Override
	public <S extends City> List<S> findAll(Example<S> arg0, Sort arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<City> findAllById(Iterable<Long> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public City getOne(Long arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends City> List<S> saveAll(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends City> S saveAndFlush(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<City> findAll(Pageable arg0) {

		return null;
	}

	@Override
	public <S extends City> long count(Example<S> arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends City> boolean exists(Example<S> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends City> Page<S> findAll(Example<S> arg0, Pageable arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends City> Optional<S> findOne(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}


}
