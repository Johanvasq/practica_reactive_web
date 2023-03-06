package co.com.ias.practica_reactive_web.domain.model.gateways;

import co.com.ias.practica_reactive_web.domain.model.student.Student;

import java.util.List;

public interface IStudentRepository {

    Boolean saveStudent(Student student);

    Boolean updateStudent(Student student);

    Boolean saveStudentsInCourse(List<Student> students);

    Boolean deleteStudentInCourse(Long id);

    Student findStudentById(Long id);

    List<Student> findAllStudents();

    List<Student> findAllStudentsByCourseId(Long id);


}
