package com.example.demo.controllers;

import com.example.demo.models.Transaction;
import com.example.demo.repository.TransactionRepository;
import com.wordnik.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/transactions")
@Api(value="Transaction controller", description="Operations regarding transactions", tags = {"A3"})

public class TransactionController {

    @GetMapping
    @ApiOperation(value = "Get transactions", notes = "Get transaction by specifying amount of transactions needed", tags =  "Transactions")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list")
    })
    public List<Transaction> getTransactions(@ApiParam(value = "Amount of transactions needed - Currently required for testing purpose",
            required = true)
                                                 @RequestParam int amount){
        TransactionRepository transactions = new TransactionRepository();
        return transactions.getTransactionRepository(amount);
    }
}
