package co.com.ias.practica_reactive_web.infrastructure.adapters.r2dbc;

import co.com.ias.practica_reactive_web.domain.model.gateways.IStudentRepository;
import co.com.ias.practica_reactive_web.domain.model.student.Student;
import co.com.ias.practica_reactive_web.infrastructure.adapters.r2dbc.repository.IStudentRepositoryAdapter;

import java.util.List;

public class StudentRepositoryAdapter implements IStudentRepository {

    private final IStudentRepositoryAdapter repository;

    public StudentRepositoryAdapter(IStudentRepositoryAdapter repository) {
        this.repository = repository;
    }

    @Override
    public Boolean saveStudent(Student student) {
        return null;
    }

    @Override
    public Boolean updateStudent(Student student) {
        return null;
    }

    @Override
    public Boolean saveStudentsInCourse(List<Student> students) {
        return null;
    }

    @Override
    public Boolean deleteStudentInCourse(Long id) {
        return null;
    }

    @Override
    public Student findStudentById(Long id) {
        return null;
    }

    @Override
    public List<Student> findAllStudents() {
        return null;
    }

    @Override
    public List<Student> findAllStudentsByCourseId(Long id) {
        return null;
    }
}
