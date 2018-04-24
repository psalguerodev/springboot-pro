package com.udemy.backendninja.controller;

import java.util.List;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.backendninja.entity.Car;
import com.udemy.backendninja.service.CarService;

@RestController
@RequestMapping("/cars")
public class CarController {
	
	public static final Log LOGGER = LogFactory.getLog(CarController.class);
	
	@Autowired
	@Qualifier("carServiceImpl")
	private CarService carService;
	
	@GetMapping("/list")
	public ResponseEntity<List<Car>> getListCar(){
		LOGGER.info("Call :: " + "getListCar()");
		return new ResponseEntity<List<Car>>( this.carService.listCarAll() , HttpStatus.OK );
	}
	
	@GetMapping("/{code}")
	public ResponseEntity<Car> getCarByCode( @PathVariable(value="code") long code ){
		LOGGER.info("Call :: " + "getCarByCode( long code )");
		return new ResponseEntity<Car>(this.carService.findByCode(code), HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Car> addCar(@Valid @RequestBody Car car ){
		LOGGER.info("Call :: " + "addCar()");
		return new ResponseEntity<Car>(this.carService.saveCar(car) , HttpStatus.OK);
	}
	
	@PutMapping("/update/")
	public ResponseEntity<Car> updateCar(@Valid @RequestBody Car car){
		LOGGER.info("Call :: " + "updateCar()");
		return new ResponseEntity<Car>(this.carService.saveCar(car) , HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{code}")
	public ResponseEntity<Car> deleteCar(@PathVariable(value="code") long code ){
		LOGGER.info("Call :: " + "deleteCar()");
		return new ResponseEntity<Car>(this.carService.deleteCar(code), HttpStatus.OK);
	}
}
