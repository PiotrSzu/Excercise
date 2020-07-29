package com.sda.expenses;

public class InvalidCommentExpensesException extends ExpenseException{
    public InvalidCommentExpensesException(String message){
        super(message);
    }
}
