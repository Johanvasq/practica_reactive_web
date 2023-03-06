package co.com.ias.practica_reactive_web.domain.model.gateways;

import co.com.ias.practica_reactive_web.domain.model.course.Course;

import java.util.List;

public interface ICourseRepository {

    Boolean saveCourse(Course course);

    Boolean updateCourse(Course course);

    List<Course> findAllCourses();
    Course findCourseById(Long id);

}
