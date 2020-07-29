package com.sda.expenses;

public class InvalidAmountExpenseException extends ExpenseException{
public InvalidAmountExpenseException(String message) {
    super(message);
}
}
