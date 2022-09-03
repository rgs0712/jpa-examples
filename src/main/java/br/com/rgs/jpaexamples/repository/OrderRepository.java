package br.com.rgs.jpaexamples.repository;

import br.com.rgs.jpaexamples.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
