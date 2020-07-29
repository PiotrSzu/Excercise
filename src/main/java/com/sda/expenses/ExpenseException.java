package com.sda.expenses;

public abstract class ExpenseException extends Exception{
    public ExpenseException(String message){
        super(message);
    }
}
