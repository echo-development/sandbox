package com.example.demo.models;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Date;

@ApiModel(description = "All details about a transaction. ")
public class Transaction {
    @ApiModelProperty(notes = "Transaction description")
    private String description;
    @ApiModelProperty(notes = "Date of transaction")
    private Date timestamp;
    @ApiModelProperty(notes = "Transaction cost")
    private BigDecimal transactionCost;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public BigDecimal getTransactionCost() {
        return transactionCost;
    }

    public void setTransactionCost(BigDecimal transactionCost) {
        this.transactionCost = transactionCost;
    }

    public Transaction() {
    }

    private Transaction(Builder builder) {
        description = builder.description;
        timestamp = builder.timestamp;
        transactionCost = builder.transactionCost;
    }

    public static Builder newBuilder() {
        return new Builder();
    }


    public static final class Builder {
        private String description;
        private Date timestamp;
        private BigDecimal transactionCost;

        private Builder() {
        }

        public Builder setDescription(String val) {
            description = val;
            return this;
        }

        public Builder setTimestamp(Date val) {
            timestamp = val;
            return this;
        }

        public Builder setTransactionCost(BigDecimal val) {
            transactionCost = val;
            return this;
        }

        public Transaction build() {
            return new Transaction(this);
        }
    }
}
