package com.sda.expenses;

import java.util.ArrayList;
import java.util.List;

public class ExpenseService {
    private List<Expense> expenses = new ArrayList<>();
    //    public ExpenseService() {
//        this.expenses = new ArrayList<>();
//    }
    public List<Expense> getExpenses() {
        return expenses;
    }
    public void addExpense(Expense expense) {
        expenses.add(expense);
    }
    @Override
    public String toString() {
        return "ExpenseService{" +
                "expenses=" + expenses.toString() +
                '}';
    }
}
