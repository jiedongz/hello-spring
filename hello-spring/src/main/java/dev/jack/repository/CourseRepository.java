package dev.jack.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dev.jack.model.Course;

@Repository      // add annotation
public class CourseRepository implements CrudRepository<Course> {
	//@Override
	public List<Course> findAll() {
		List<Course> courses = new ArrayList<Course>();
		Course springBoot = new Course(1, "title 1", "description 1", "link 1");
		courses.add(springBoot);
		springBoot = new Course(2, "title 2", "description 2", "link 2");
		courses.add(springBoot);
		return courses;
	}

}
