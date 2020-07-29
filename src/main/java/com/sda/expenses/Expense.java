package com.sda.expenses;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Expense {
    private double amount;
    private LocalDate date;
    private String place;
    private String comment;

    public Expense(double amount, LocalDate date, String place, String comment) throws ExpenseException{
        if ( amount < 0 ){
            throw new InvalidAmountExpenseException("kwota mniejsza niż zero");
        }
        if ( LocalDate.now().isBefore(date)){
            throw new InvalidDateExpenseException("data powinna być dzisiejsza");
        }
        if ( place==null || place.trim().isEmpty()){
            throw new InvalidPlaceExpensesException("Proszę podać lokalizację");
        }
        if ( comment==null || comment.trim().isEmpty()){
            throw new InvalidCommentExpensesException("proszę podać opis");
        }
        this.amount = amount;
        this.date = date;
        this.place = place;
        this.comment = comment;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
