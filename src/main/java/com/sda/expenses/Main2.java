package com.sda.expenses;

import java.time.LocalDate;

public class Main2 {
    public static void main(String[] args) {
        ExpenseService service = new ExpenseService();
        Expense expense = null;
        try {
           expense = new Expense(
                    10.90,
                    LocalDate.of(2020, 07, 13),
                    "Warszawa",
                    "latte");

        } catch (ExpenseException e) {
            e.printStackTrace();
        }
        service.addExpense(expense);
        System.out.println(service.getExpenses());
        System.out.println(service.toString());
    }
    }
