package com.udemy.backendninja.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.udemy.backendninja.entity.Car;
import com.udemy.backendninja.repository.CarRepository;
import com.udemy.backendninja.service.CarService;

@Service("carServiceImpl")
public class CarServiceImpl implements CarService {

	@Autowired
	@Qualifier("carRepository")
	private CarRepository carRepository;

	@Override
	public Car saveCar(Car car) {
		// TODO Auto-generated method stub
		return this.carRepository.save(car);
	}

	@Override
	public Car updateCar(Car car) {
		// TODO Auto-generated method stub
		return this.carRepository.save(car);
	}

	@Override
	public List<Car> listCarAll() {
		// TODO Auto-generated method stub
		return this.carRepository.findAll();
	}

	@Override
	public Car deleteCar(long code) {
		// TODO Auto-generated method stub
		Car c = this.findByCode(code);
		if (c != null) {
			this.carRepository.delete(c);
			return c;
		}
		return null;
	}

	@Override
	public Car findByCode(long code) {
		// TODO Auto-generated method stub
		return this.carRepository.findByCode(code);
	}

}
