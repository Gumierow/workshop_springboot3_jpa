package com.educandoweb.SpringBootCourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.SpringBootCourse.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
