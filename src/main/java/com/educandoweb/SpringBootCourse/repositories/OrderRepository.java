package com.educandoweb.SpringBootCourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.SpringBootCourse.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
