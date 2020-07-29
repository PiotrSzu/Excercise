package com.sda.expenses;

public class InvalidDateExpenseException extends ExpenseException{
    public InvalidDateExpenseException(String message){
        super(message);
    }
}
