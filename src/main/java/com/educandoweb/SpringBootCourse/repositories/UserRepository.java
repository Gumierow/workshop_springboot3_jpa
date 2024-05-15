package com.educandoweb.SpringBootCourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.SpringBootCourse.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
