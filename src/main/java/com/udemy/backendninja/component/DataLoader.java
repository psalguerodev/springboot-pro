package com.udemy.backendninja.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.udemy.backendninja.entity.Car;
import com.udemy.backendninja.service.CarService;

@Component
public class DataLoader implements CommandLineRunner{

	@Autowired
	@Qualifier("carServiceImpl")
	private CarService carService;
	
	private boolean flagRun = false; 
	
	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		if( this.flagRun ){
			Car car1 = new Car();
			car1.setYear(2018);
			car1.setModel("Toyota Yaris - Corolla");
			car1.setDescription("Ultimo toyota en exibición");
			car1.setPrice(16000.00);
			
			Car car2 = new Car();
			car2.setYear(2017);
			car2.setModel("Susuki - Gran Nomade");
			car2.setDescription("Model Exclusivo deportivo");
			
			this.carService.saveCar(car1);
			this.carService.saveCar(car2);
		}
		
	}

	
	
}
