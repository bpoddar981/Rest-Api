package com.springrest.sptingrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.sptingrest.Dao.CourseDao;
import com.springrest.sptingrest.entites.Course;


@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	public CourseDao courseDao;
	
	
	

	@Override
	public List<Course> getCourses() {
		 
		return courseDao.findAll(); // findAll will return all the list from the database
	}



	@Override
	public Course getCourse(long courseId) {
		

		return courseDao.getOne(courseId);
	}



	@Override
	public Course addCourse(Course course) {
		courseDao.save(course);
		return course;
	}



	@Override
	public Course updateCourse(Course course) {
	  courseDao.save(course); // using same function as add because it will not add the course which already exist it will update it id same course id passed 
	  
		return course;
	}



	@Override
	public void deleteCourse(long parseLong) {
		Course entity = courseDao.getOne(parseLong); 
		courseDao.delete(entity);
	}



	 

}


/*
 * // temprorary data created later we will add database here
 * 
 * List<Course> list; public CourseServiceImpl() {
 * 
 * list =new ArrayList<>(); list.add(new Course(145,"Java core Course",
 * "this course contains basic of java")); list.add(new
 * Course(4343,"Springboot course","Creating springboot project using rest api")
 * );
 * 
 * }
 * 
 * 
 * 
 * @Override public List<Course> getCourses() {
 * 
 * return list; }
 * 
 * 
 * 
 * @Override public Course getCourse(long courseId) {
 * 
 * Course c=null; for (Course course:list) { if( course.getId() == courseId ) {
 * 
 * c=course; break; } } return c; }
 * 
 * 
 * 
 * @Override public Course addCourse(Course course) { list.add(course); return
 * course; }
 * 
 * 
 * 
 * @Override public Course updateCourse(Course course) { list.forEach(e ->{
 * if(e.getId() == course.getId()) { e.setTitle(course.getTitle());
 * e.setDesctiption(course.getDesctiption()); } }); return course; }
 * 
 * 
 * 
 * @Override public void deleteCourse(long parseLong) { list=
 * this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList(
 * ));
 * 
 * }
 */


 

