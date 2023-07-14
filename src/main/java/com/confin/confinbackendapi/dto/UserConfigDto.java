package com.confin.confinbackendapi.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class UserConfigDto {

    private Long userId;
    private LocalDate dueDate;
    private LocalDate closingDate;
    private BigDecimal expenseGoal;
    private LocalDate beginDate;
    private LocalDate endDate;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDate getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(LocalDate closingDate) {
        this.closingDate = closingDate;
    }

    public BigDecimal getExpenseGoal() {
        return expenseGoal;
    }

    public void setExpenseGoal(BigDecimal expenseGoal) {
        this.expenseGoal = expenseGoal;
    }

    public LocalDate getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(LocalDate beginDate) {
        this.beginDate = beginDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
