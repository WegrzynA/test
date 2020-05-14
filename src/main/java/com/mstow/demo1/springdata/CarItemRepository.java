package com.mstow.demo1.springdata;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CarItemRepository extends JpaRepository<CarItem, Integer> {
}
