package com.confin.confinbackendapi.service;

import com.confin.confinbackendapi.dto.ExpenseDto;
import com.confin.confinbackendapi.model.Expense;


public interface ExpenseService {

    Expense create(ExpenseDto expenseDto);
    Expense findById(Long id);
    Expense update(ExpenseDto expenseDto);
    void delete(Long id);
}
