package dev.jack.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import dev.jack.repository.CourseRepository;
import dev.jack.service.CourseService;

@Configuration
@ComponentScan("dev.jack")
public class AppConfig {
//	@Bean("courseRepository")
//	public CourseRepository getCourseRepository() {
//		return new CourseRepository();
//	}
//	@Bean("courseService")
//	public CourseService getCourseService() {
//		return new CourseService(getCourseRepository());
//	}
}
