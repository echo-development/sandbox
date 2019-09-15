package com.example.demo.controllers;

import com.example.demo.models.Transaction;
import com.example.demo.repository.TransactionRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @GetMapping
    public List<Transaction> getTransactions(@RequestParam int amount){
        TransactionRepository transactions = new TransactionRepository();
        return transactions.getTransactionRepository(amount);
    }
}
