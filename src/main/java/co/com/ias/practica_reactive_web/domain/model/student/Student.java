package co.com.ias.practica_reactive_web.domain.model.student;

import co.com.ias.practica_reactive_web.domain.model.course.attributes.CourseId;
import co.com.ias.practica_reactive_web.domain.model.student.attributes.StudentEmail;
import co.com.ias.practica_reactive_web.domain.model.student.attributes.StudentId;
import co.com.ias.practica_reactive_web.domain.model.student.attributes.StudentName;

public class Student {
    private final StudentId studentId;
    private final StudentName studentName;
    private final StudentEmail studentEmail;
    private final CourseId courseId;

    public Student(StudentId studentId, StudentName studentName, StudentEmail studentEmail, CourseId courseId) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.courseId = courseId;
    }

    public StudentId getStudentId() {
        return studentId;
    }

    public StudentName getStudentName() {
        return studentName;
    }

    public StudentEmail getStudentEmail() {
        return studentEmail;
    }

    public CourseId getCourseId() {
        return courseId;
    }
}
