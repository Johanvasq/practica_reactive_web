package co.com.ias.practica_reactive_web.infrastructure.adapters.r2dbc;

import co.com.ias.practica_reactive_web.domain.model.course.Course;
import co.com.ias.practica_reactive_web.domain.model.gateways.ICourseRepository;
import co.com.ias.practica_reactive_web.infrastructure.adapters.r2dbc.dbo.CourseDBO;
import co.com.ias.practica_reactive_web.infrastructure.adapters.r2dbc.repository.ICourseRepositoryAdapter;
import reactor.core.publisher.Mono;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CourseRepositoryAdapter implements ICourseRepository {

    private final ICourseRepositoryAdapter repository;

    public CourseRepositoryAdapter(ICourseRepositoryAdapter repository) {
        this.repository = repository;
    }

    @Override
    public Mono<Boolean> saveCourse(Course course) {
        return repository
                .save(CourseDBO.fromDomain(course))
                .map(savedCourse -> true)
                .onErrorReturn(false);
    }

    @Override
    public Mono<Boolean> updateCourse(Course course) {
        return repository
                .save(CourseDBO.fromDomain(course))
                .map(savedCourse -> true)
                .onErrorReturn(false);
    }

    @Override
    public Mono<List<Course>> findAllCourses() {
        return repository
                .findAll()
                .collect(Collectors.toList())
                .flatMap(courseDBOS -> {
                    if (courseDBOS.isEmpty()) {
                        return Mono.just(Collections.emptyList());
                    } else {
                        List<Course> courses = courseDBOS.stream()
                                .map(CourseDBO::toDomain)
                                .toList();
                        return Mono.just(courses);
                    }
                });
    }

    @Override
    public Mono<Course> findCourseById(Long id) {
        return repository
                .findById(id)
                .map(CourseDBO::toDomain);
    }
}
