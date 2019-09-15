package com.example.demo.repository;

import com.example.demo.models.Transaction;

import java.math.BigDecimal;
import java.util.*;

public class TransactionRepository {

    public List<Transaction> getTransactionRepository(int amountOfTransactions){
        List<Transaction> transactionList = new ArrayList<>();
        for (int i = 0; i < amountOfTransactions; i++){
            transactionList.add(getRandomTransaction());
        }
        return transactionList;
    }

    private Transaction getRandomTransaction(){
        return Transaction.newBuilder()
                .setDescription(getRandomDescription())
                .setTransactionCost(getRandomTransactionCost())
                .setTimestamp(getRandomDate()).build();
    }
    private String getRandomDescription(){
        Random rand = new Random();
        int n = rand.nextInt(10);
        switch (n){
            case 0:
                return "Diverse ydelser";
            case 1:
                return "Bilka";
            case 2:
                return "Mobilepay";
            case 3:
                return "Føtex";
            case 4:
                return "Mælk fra landmanden";
            case 5:
                return "Netto";
            case 6:
                return "Brugsen";
            case 7:
                return "Plantemanden";
            case 8:
                return "Hemmelige ydelser";
            case 9:
                return "Bonbonland";
            case 10:
                return "Fakta";
             default:
                 return "Det burde ikke ske";
        }
    }

    private BigDecimal getRandomTransactionCost(){
        Random rand = new Random();
        int n = rand.nextInt(11);
        switch (n){
            case 0:
                return new BigDecimal(50);
            case 1:
                return new BigDecimal(75);
            case 2:
                return new BigDecimal(123);
            case 3:
                return new BigDecimal(140);
            case 4:
                return new BigDecimal(175);
            case 5:
                return new BigDecimal(200);
            case 6:
                return new BigDecimal(225);
            case 7:
                return new BigDecimal(250);
            case 8:
                return new BigDecimal(275);
            case 9:
                return new BigDecimal(325);
            case 10:
                return new BigDecimal(350);
            default:
                return new BigDecimal(425);
        }

    }

    private Date getRandomDate(){
        Random rand = new Random();
        int n = rand.nextInt(11);
        Calendar calendar = Calendar.getInstance();
        switch (n){
            case 0:
                calendar.set(2017, Calendar.JANUARY, 14, 5, 59, 59);
                return calendar.getTime();
            case 1:
                calendar.set(2018, Calendar.MARCH, 6, 7, 25, 0);
                return calendar.getTime();
            case 2:
                calendar.set(1987, Calendar.MAY, 4, 9, 58, 0);
                return calendar.getTime();
            case 3:
                calendar.set(1986, Calendar.FEBRUARY, 28, 8, 55, 0);
                return calendar.getTime();
            case 4:
                calendar.set(2013, Calendar.AUGUST, 23, 12, 42, 0);
                return calendar.getTime();
            case 5:
                calendar.set(2011, Calendar.SEPTEMBER, 1, 14, 37, 0);
                return calendar.getTime();
            case 6:
                calendar.set(2009, Calendar.OCTOBER, 19, 16, 33, 0);
                return calendar.getTime();
            case 7:
                calendar.set(2007, Calendar.MAY, 17, 17, 7, 0);
                return calendar.getTime();
            case 8:
                calendar.set(2005, Calendar.DECEMBER, 15, 18, 2, 0);
                return calendar.getTime();
            case 9:
                calendar.set(2017, Calendar.FEBRUARY, 13, 22, 23, 0);
                return calendar.getTime();
            case 10:
                calendar.set(2019, Calendar.JUNE, 7, 21, 17, 0);
                return calendar.getTime();
            default:
                calendar.set(1999, Calendar.JULY, 5, 23, 15, 0);
                return calendar.getTime();
        }
    }
}
