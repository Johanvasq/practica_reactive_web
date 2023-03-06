package co.com.ias.practica_reactive_web.infrastructure.adapters.r2dbc;

import co.com.ias.practica_reactive_web.domain.model.course.Course;
import co.com.ias.practica_reactive_web.domain.model.gateways.ICourseRepository;
import co.com.ias.practica_reactive_web.infrastructure.adapters.r2dbc.repository.ICourseRepositoryAdapter;

import java.util.List;

public class CourseRepositoryAdapter implements ICourseRepository {

    private final ICourseRepositoryAdapter repository;

    public CourseRepositoryAdapter(ICourseRepositoryAdapter repository) {
        this.repository = repository;
    }

    @Override
    public Boolean saveCourse(Course course) {
        return null;
    }

    @Override
    public Boolean updateCourse(Course course) {
        return null;
    }

    @Override
    public List<Course> findAllCourses() {
        return null;
    }

    @Override
    public Course findCourseById(Long id) {
        return null;
    }
}
