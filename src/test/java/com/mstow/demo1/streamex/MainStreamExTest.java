package com.mstow.demo1.streamex;

import one.util.streamex.StreamEx;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainStreamExTest {

    @Test
    public void list() {
        List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
        List<Integer> list = StreamEx.of(strings).map(Integer::valueOf).filter(integer -> integer <= 3).toList();
        List<Integer> list2 = strings.stream().map(Integer::valueOf).filter(integer -> integer <= 3).collect(Collectors.toList());
        System.out.println(list);
    }

    @Test
    public void map() {
        List<Car> cars = Arrays.asList(
                Car.of("Audi", "A4"),
                Car.of("Audi", "A5"),
                Car.of("BMW", "3"),
                Car.of("BMW", "5"),
                Car.of("Mercedes", "S5"));

        Map<String, List<Car>> carsByBrand = cars.stream().collect(Collectors.groupingBy(Car::getBrand));
        Map<String, List<Car>> carsByBrand2 = StreamEx.of(cars).groupingBy(Car::getBrand);
    }
}