//package com.mstow.demo1.springdata;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@RunWith(SpringRunner.class)
//@DataJpaTest
//public class CarItemRepositoryTest {
//
//    @Autowired
//    CarItemRepository carItemRepository;
//
//    @Autowired
//    CarRepository carRepository;
//
//    @Test
//    public void testCarItemRepository() {
//        Car car = new Car();
//        car.setId(1);
//        car.setName("one");
//        Car savedCar = carRepository.save(car);
//        CarItem carItem = new CarItem();
//        carItem.setId(1);
//        carItem.setName("wheel");
//        carItem.setCar(savedCar);
//        CarItem savedCarItem = carItemRepository.save(carItem);
//
//        CarItem actual = carItemRepository.findAll().get(0);
//        assertEquals(savedCarItem, actual);
//    }
//}