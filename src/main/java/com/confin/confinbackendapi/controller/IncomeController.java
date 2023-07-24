package com.confin.confinbackendapi.controller;

import com.confin.confinbackendapi.dto.IncomeDto;
import com.confin.confinbackendapi.model.Income;
import com.confin.confinbackendapi.service.IncomeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/incomes")
public class IncomeController {

    final IncomeService incomeService;

    public IncomeController(IncomeService incomeService) {
        this.incomeService = incomeService;
    }

    @PostMapping("/create")
    public ResponseEntity<Income> create(@RequestBody IncomeDto incomeDto) {
        return ResponseEntity.ok(incomeService.create(incomeDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Income> getIncome(@PathVariable Long id) {
        return ResponseEntity.ok(incomeService.findById(id));
    }

    @DeleteMapping("/{id}")
    public void deleteIncome(@PathVariable Long id) {
        incomeService.delete(id);
    }
}
