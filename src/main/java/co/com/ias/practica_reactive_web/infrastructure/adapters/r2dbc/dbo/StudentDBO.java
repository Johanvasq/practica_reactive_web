package co.com.ias.practica_reactive_web.infrastructure.adapters.r2dbc.dbo;

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
    private final Long courseId;
}
