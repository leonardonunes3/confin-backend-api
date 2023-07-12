package com.confin.confinbackendapi.service;

import com.confin.confinbackendapi.dto.IncomeDto;
import com.confin.confinbackendapi.model.Income;

public interface IncomeService {

    Income create(IncomeDto incomeDto);
    Income findById(Long id);
    Income update(IncomeDto incomeDto);
    void delete(Long id);
}
