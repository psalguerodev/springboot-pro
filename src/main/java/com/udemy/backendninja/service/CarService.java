package com.udemy.backendninja.service;

import java.util.List;

import com.udemy.backendninja.entity.Car;

public interface CarService {

	public abstract Car saveCar( Car car );
	
	public abstract Car updateCar( Car car );
	
	public abstract List<Car> listCarAll();
	
	public abstract Car deleteCar( long code );
	
	public abstract Car findByCode( long code );
	
}
