package com.springrest.sptingrest.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.sptingrest.entites.Course;

//Course is the entity and long is the primary key of course entity i.e id datatype
public interface CourseDao extends JpaRepository<Course, Long> {

}
