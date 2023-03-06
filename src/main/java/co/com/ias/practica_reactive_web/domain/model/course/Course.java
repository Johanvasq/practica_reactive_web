package co.com.ias.practica_reactive_web.domain.model.course;

import co.com.ias.practica_reactive_web.domain.model.course.attributes.CourseId;
import co.com.ias.practica_reactive_web.domain.model.course.attributes.CourseName;

public class Course {
    private final CourseId courseId;
    private final CourseName courseName;

    public Course(CourseId courseId, CourseName courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public CourseId getCourseId() {
        return courseId;
    }

    public CourseName getCourseName() {
        return courseName;
    }
}
