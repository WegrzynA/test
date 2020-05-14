package com.mstow.demo1.springdata;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class CarItem {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "carId")
    private Car car;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarItem carItem = (CarItem) o;
        return id == carItem.id &&
                Objects.equals(name, carItem.name) &&
                Objects.equals(car, carItem.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, car);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
