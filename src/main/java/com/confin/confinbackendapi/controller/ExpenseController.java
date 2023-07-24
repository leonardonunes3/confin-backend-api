package com.confin.confinbackendapi.controller;


import com.confin.confinbackendapi.dto.ExpenseDto;
import com.confin.confinbackendapi.model.Expense;
import com.confin.confinbackendapi.service.ExpenseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {

    final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @PostMapping("/create")
    public ResponseEntity<Expense> create(@RequestBody ExpenseDto expenseDto) {
        return ResponseEntity.ok(expenseService.create(expenseDto));
    }
}
