package br.com.rgs.jpaexamples.repository;

import br.com.rgs.jpaexamples.domain.Request;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepository extends JpaRepository<Request, Long> {
}
