package co.com.ias.practica_reactive_web.infrastructure.adapters.r2dbc.repository;

import co.com.ias.practica_reactive_web.infrastructure.adapters.r2dbc.dbo.StudentDBO;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.util.List;

@Repository
public interface IStudentRepositoryAdapter extends ReactiveCrudRepository<StudentDBO, Long> {
    Mono<List<StudentDBO>> findByCourseId(Long id);
}
