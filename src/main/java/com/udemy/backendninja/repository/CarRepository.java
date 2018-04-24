package com.udemy.backendninja.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udemy.backendninja.entity.Car;

@Repository("carRepository")
public interface CarRepository extends JpaRepository<Car, Serializable>{

	public abstract Car findByCode( long code );
	
}
