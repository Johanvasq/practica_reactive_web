package co.com.ias.practica_reactive_web.domain.model.gateways;

import co.com.ias.practica_reactive_web.domain.model.course.Course;
import reactor.core.publisher.Mono;

import java.util.List;

public interface ICourseRepository {

    Mono<Boolean> saveCourse(Course course);

    Mono<Boolean> updateCourse(Course course);

    Mono<List<Course>> findAllCourses();
    Mono<Course> findCourseById(Long id);

}
