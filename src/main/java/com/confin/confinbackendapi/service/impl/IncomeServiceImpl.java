package com.confin.confinbackendapi.service.impl;

import com.confin.confinbackendapi.dto.IncomeDto;
import com.confin.confinbackendapi.model.Income;
import com.confin.confinbackendapi.model.User;
import com.confin.confinbackendapi.repository.IncomeRepository;
import com.confin.confinbackendapi.repository.UserRepository;
import com.confin.confinbackendapi.service.IncomeService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class IncomeServiceImpl implements IncomeService {

    final IncomeRepository incomeRepository;

    final UserRepository userRepository;

    public IncomeServiceImpl(IncomeRepository incomeRepository, UserRepository userRepository) {
        this.incomeRepository = incomeRepository;
        this.userRepository = userRepository;
    }

    @Override
    public Income create(IncomeDto incomeDto) {
        Income income = new Income();
        User user = userRepository.findById(incomeDto.getUserId())
                .orElseThrow(
                        ()-> new EntityNotFoundException(
                                String.format(
                                        "User with id [%d] was not found!",
                                        incomeDto.getUserId()
                                ))
                );

        income.setAmount(incomeDto.getAmount());
        income.setDescription(incomeDto.getDescription());
        income.setBeginDate(incomeDto.getBeginDate());
        income.setEndDate(incomeDto.getEndDate());
        income.setUser(user);

        return incomeRepository.save(income);
    }

    @Override
    public Income findById(Long id) {
        return incomeRepository.findById(id)
                .orElseThrow(
                        ()-> new EntityNotFoundException(
                        String.format(
                                "Income with id [%d] was not found!",
                                id
                        ))
                );
    }

    @Override
    public Income update(IncomeDto incomeDto) {
        /*
        * TO-DO: Implement later
        * */
        return null;
    }

    @Override
    public void delete(Long id) {
        incomeRepository.deleteById(id);
    }
}
