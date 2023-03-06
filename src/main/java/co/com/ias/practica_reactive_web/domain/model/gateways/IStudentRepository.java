package co.com.ias.practica_reactive_web.domain.model.gateways;

import co.com.ias.practica_reactive_web.domain.model.student.Student;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface IStudentRepository {

    Mono<Boolean> saveStudent(Student student);

    Mono<Boolean> updateStudent(Student student);

    Mono<Student> findStudentById(Long id);

    Mono<List<Student>> findAllStudents();

    Mono<List<Student>> findAllStudentsByCourseId(Long id);


}
