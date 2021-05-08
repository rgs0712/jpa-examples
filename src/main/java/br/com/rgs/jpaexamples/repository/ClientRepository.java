package br.com.rgs.jpaexamples.repository;

import br.com.rgs.jpaexamples.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
