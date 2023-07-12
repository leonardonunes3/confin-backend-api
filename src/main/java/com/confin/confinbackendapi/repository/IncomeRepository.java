package com.confin.confinbackendapi.repository;

import com.confin.confinbackendapi.model.Income;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncomeRepository extends JpaRepository<Income, Long> {
}
