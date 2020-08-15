//package com.mstow.demo1.springdata;
//
//import org.assertj.core.api.Assertions;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = {DataApplication.class})
//public class CarRepositoryTest {
//
//    @Autowired
//    CarRepository carRepository;
//
//    @Test
//    public void testCarRepository() {
//        Car car = new Car();
//        car.setId(1);
//        car.setName("one");
//        Car savedCar = carRepository.save(car);
//
//        Assertions.assertThat(savedCar).isEqualTo(car);
//    }
//}