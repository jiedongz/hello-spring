package dev.jack;

/* how to create Spring application without boot */
/* push to gitHub */

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.jack.config.AppConfig;
import dev.jack.model.Course;
import dev.jack.service.CourseService;

public class Application {

	public static void main(String[] args) {
		// CourseService service = new CourseService();
		// System.out.println(service.list());
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		CourseService service = applicationContext.getBean("courseService", CourseService.class);
		System.out.println(service.list());
	}

}
