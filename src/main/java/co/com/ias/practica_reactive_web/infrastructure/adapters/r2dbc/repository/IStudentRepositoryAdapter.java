package co.com.ias.practica_reactive_web.infrastructure.adapters.r2dbc.repository;

import co.com.ias.practica_reactive_web.infrastructure.adapters.r2dbc.dbo.StudentDBO;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepositoryAdapter extends ReactiveCrudRepository<StudentDBO, Long> {
}
