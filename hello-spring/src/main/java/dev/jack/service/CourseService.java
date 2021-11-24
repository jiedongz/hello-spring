package dev.jack.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import dev.jack.model.Course;
import dev.jack.repository.CourseRepository;

@Service
public class CourseService implements CrudService<Course> {
	// private List<Course> courses;
	private CourseRepository repository;
	
	public CourseService(CourseRepository courseRepository) {
		//courses = new ArrayList();
		//Course springBoot = new Course(1, "title 1", "description 1", "link 1");
		//courses.add(springBoot);
		
		//repository = new CourseRepository();
		this.repository = courseRepository;
	}

	public List<Course> list() {
		//return courses;
		return repository.findAll();
	}

	public void create(Course t) {
		// TODO Auto-generated method stub
		
	}

	public Optional<Course> get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(Course t, int id) {
		// TODO Auto-generated method stub
		
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
