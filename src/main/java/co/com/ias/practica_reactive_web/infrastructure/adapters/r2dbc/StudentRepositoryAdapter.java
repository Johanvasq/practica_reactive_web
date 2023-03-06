package co.com.ias.practica_reactive_web.infrastructure.adapters.r2dbc;

import co.com.ias.practica_reactive_web.domain.model.gateways.IStudentRepository;
import co.com.ias.practica_reactive_web.domain.model.student.Student;
import co.com.ias.practica_reactive_web.infrastructure.adapters.r2dbc.dbo.StudentDBO;
import co.com.ias.practica_reactive_web.infrastructure.adapters.r2dbc.repository.IStudentRepositoryAdapter;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StudentRepositoryAdapter implements IStudentRepository {

    private final IStudentRepositoryAdapter repository;

    public StudentRepositoryAdapter(IStudentRepositoryAdapter repository) {
        this.repository = repository;
    }

    @Override
    public Mono<Boolean> saveStudent(Student student) {
        return repository
                .save(StudentDBO.fromDomain(student))
                .map(savedStudent -> true)
                .onErrorReturn(false);
    }

    @Override
    public Mono<Boolean> updateStudent(Student student) {
        return repository
                .save(StudentDBO.fromDomain(student))
                .map(savedStudent -> true)
                .onErrorReturn(false);
    }

    @Override
    public Mono<Student> findStudentById(Long id) {
        return repository
                .findById(id)
                .map(StudentDBO::toDomain);
    }

    @Override
    public Mono<List<Student>> findAllStudents() {
        return repository.findAll()
                .collect(Collectors.toList())
                .flatMap(studentDBOS -> {
                    if (studentDBOS.isEmpty()){
                        return Mono.just(Collections.emptyList());
                    } else {
                        List<Student> students = studentDBOS.stream()
                                .map(StudentDBO::toDomain)
                                .collect(Collectors.toList());
                        return Mono.just(students);
                    }
                });
    }


    @Override
    public Mono<List<Student>> findAllStudentsByCourseId(Long id) {
        return repository
                .findByCourseId(id)
                .flatMap(studentDBOS -> {
                    if (studentDBOS.isEmpty()) {
                        return Mono.just(Collections.emptyList());
                    } else {
                        List<Student> students = studentDBOS.stream()
                                .map(StudentDBO::toDomain)
                                .collect(Collectors.toList());
                        return Mono.just(students);
                    }
                });
    }

}
