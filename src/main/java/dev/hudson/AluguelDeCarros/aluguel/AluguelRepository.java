package dev.hudson.AluguelDeCarros.aluguel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AluguelRepository extends JpaRepository<AluguelModel, Long> {
}
