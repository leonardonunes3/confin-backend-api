package com.confin.confinbackendapi.repository;

import com.confin.confinbackendapi.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
