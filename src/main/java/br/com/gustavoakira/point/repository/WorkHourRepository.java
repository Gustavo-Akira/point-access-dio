package br.com.gustavoakira.point.repository;

import br.com.gustavoakira.point.model.WorkHours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkHourRepository extends JpaRepository<WorkHours, Long> {
}
