package com.educandoweb.SpringBootCourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.SpringBootCourse.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
