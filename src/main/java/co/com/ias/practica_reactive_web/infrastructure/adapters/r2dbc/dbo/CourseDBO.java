package co.com.ias.practica_reactive_web.infrastructure.adapters.r2dbc.dbo;


import co.com.ias.practica_reactive_web.domain.model.course.Course;
import co.com.ias.practica_reactive_web.domain.model.course.attributes.CourseId;
import co.com.ias.practica_reactive_web.domain.model.course.attributes.CourseName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Builder
@AllArgsConstructor
@Getter
@Table("course")
public class CourseDBO {
    @Id
    private final Long id;
    private final String name;

    public static CourseDBO fromDomain(Course course){
        return CourseDBO.builder()
              .id(course.getCourseId().getValue())
              .name(course.getCourseName().getValue())
              .build();
    }

    public Course toDomain(){
        return new Course(
                new CourseId(this.id),
                new CourseName(this.name)
        );
    }
}
