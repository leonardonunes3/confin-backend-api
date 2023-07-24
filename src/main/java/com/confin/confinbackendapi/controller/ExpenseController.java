package com.confin.confinbackendapi.controller;


import com.confin.confinbackendapi.dto.ExpenseDto;
import com.confin.confinbackendapi.model.Expense;
import com.confin.confinbackendapi.service.ExpenseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public ResponseEntity<Expense> getExpense(@PathVariable Long id) {
        return ResponseEntity.ok(expenseService.findById(id));
    }

    @DeleteMapping("/{id}")
    public void deleteExpense(@PathVariable Long id) {
        expenseService.delete(id);
    }
}
