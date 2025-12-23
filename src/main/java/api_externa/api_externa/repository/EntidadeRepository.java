package api_externa.api_externa.repository;

import api_externa.api_externa.model.Entidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntidadeRepository extends JpaRepository <Entidade, Long> {
}
