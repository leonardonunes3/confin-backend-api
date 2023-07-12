package com.confin.confinbackendapi.controller;

import com.confin.confinbackendapi.dto.IncomeDto;
import com.confin.confinbackendapi.model.Income;
import com.confin.confinbackendapi.service.IncomeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
