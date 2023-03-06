package co.com.ias.practica_reactive_web.infrastructure.adapters.r2dbc.dbo;

import co.com.ias.practica_reactive_web.domain.model.course.attributes.CourseId;
import co.com.ias.practica_reactive_web.domain.model.student.Student;
import co.com.ias.practica_reactive_web.domain.model.student.attributes.StudentEmail;
import co.com.ias.practica_reactive_web.domain.model.student.attributes.StudentId;
import co.com.ias.practica_reactive_web.domain.model.student.attributes.StudentName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Builder
@AllArgsConstructor
@Getter
@Table("student")
public class StudentDBO {

    @Id
    private final Long id;
    private final String name;
    private final String email;
    private final Long courseId;

    public static StudentDBO fromDomain(Student student) {
        return StudentDBO.builder()
                .id(student.getStudentId().getValue())
                .name(student.getStudentName().getValue())
                .courseId(student.getCourseId().getValue())
                .email(student.getStudentEmail().getValue())
                .build();
    }

    public Student toDomain() {
        return new Student(
                new StudentId(this.id),
                new StudentName(this.name),
                new StudentEmail(this.email),
                new CourseId(this.courseId));
    }
}
