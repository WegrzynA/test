package com.mstow.demo1.springdata;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.UUID;

@Component
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public void saveRandomCar(){
        Car car = new Car();
        car.setName(UUID.randomUUID().toString());

        carRepository.save(car);
    }

    @PostConstruct
    public void init() {
        saveRandomCar();
    }
}
