package com.confin.confinbackendapi.dto;

import com.confin.confinbackendapi.model.Expense;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ExpenseDto {

    private Long userId;
    private String description;
    private BigDecimal amount;
    private LocalDate beginDate;
    private LocalDate endDate;
    private Boolean installment;
    private Expense.category category;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Boolean getInstallment() {
        return installment;
    }

    public void setInstallment(Boolean installment) {
        this.installment = installment;
    }

    public Expense.category getCategory() {
        return category;
    }

    public void setCategory(Expense.category category) {
        this.category = category;
    }
}
