package com.sda.expenses;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        try {
            Expense expense = new Expense(5, LocalDate.of(2020,07,18),"Zielona Góra", "  ");
        } catch (ExpenseException e) {
            System.out.println("Wystapił wyjątek " + e.getMessage());;
        }
    }
}
