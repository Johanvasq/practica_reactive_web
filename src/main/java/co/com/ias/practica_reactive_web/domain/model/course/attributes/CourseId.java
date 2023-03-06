package co.com.ias.practica_reactive_web.domain.model.course.attributes;

public class CourseId {
    private final Long value;

    public CourseId(Long value) {
        this.value = value;
    }

    public Long getValue() {
        return value;
    }
}
