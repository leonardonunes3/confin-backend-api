package com.confin.confinbackendapi.service.impl;

import com.confin.confinbackendapi.dto.ExpenseDto;
import com.confin.confinbackendapi.model.Expense;
import com.confin.confinbackendapi.model.User;
import com.confin.confinbackendapi.repository.ExpenseRepository;
import com.confin.confinbackendapi.repository.UserRepository;
import com.confin.confinbackendapi.service.ExpenseService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    final ExpenseRepository expenseRepository;

    final UserRepository userRepository;

    public ExpenseServiceImpl(ExpenseRepository expenseRepository, UserRepository userRepository) {
        this.expenseRepository = expenseRepository;
        this.userRepository = userRepository;
    }

    @Override
    public Expense create(ExpenseDto expenseDto) {
        Expense expense = new Expense();
        User user = userRepository.findById(expenseDto.getUserId())
                .orElseThrow(
                        ()-> new EntityNotFoundException(
                                String.format(
                                        "User with id [%d] was not found!",
                                        expenseDto.getUserId()
                                ))
                );

        expense.setAmount(expenseDto.getAmount());
        expense.setDescription(expenseDto.getDescription());
        expense.setBeginDate(expenseDto.getBeginDate());
        expense.setEndDate(expenseDto.getEndDate());
        expense.setInstallment(expenseDto.getInstallment());
        expense.setCategory(expenseDto.getCategory());
        expense.setUser(user);

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
