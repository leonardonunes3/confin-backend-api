package com.confin.confinbackendapi.service.impl;

import com.confin.confinbackendapi.dto.ExpenseDto;
import com.confin.confinbackendapi.model.Expense;
import com.confin.confinbackendapi.repository.ExpenseRepository;
import com.confin.confinbackendapi.service.ExpenseService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    final ExpenseRepository expenseRepository;

    public ExpenseServiceImpl(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    @Override
    public Expense create(ExpenseDto expenseDto) {
        Expense expense = new Expense();
        expense.setAmount(expenseDto.getAmount());
        expense.setDescription(expenseDto.getDescription());
        expense.setBeginDate(expenseDto.getBeginDate());
        expense.setEndDate(expenseDto.getEndDate());
        expense.setInstallment(expenseDto.getInstallment());
        expense.setCategory(expenseDto.getCategory());

        /*
        * TO-DO: Recover user id and set
        * expense.setUser_id();
        * */
        return expenseRepository.save(expense);
    }

    @Override
    public Expense findById(Long id) {
        return expenseRepository.findById(id)
                .orElseThrow(
                        ()-> new EntityNotFoundException(
                                String.format(
                                        "Expense with id [%d] was not found!",
                                        id
                                ))
                );
    }

    @Override
    public Expense update(ExpenseDto expenseDto) {
        /*
         * TO-DO: Implement later
         * */
        return null;
    }

    @Override
    public void delete(Long id) {
        expenseRepository.deleteById(id);
    }
}
