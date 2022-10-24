package com.example.bankaccount.entities;

import com.example.bankaccount.enums.AccountType;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = BankAccount.class, name = "p1")
public interface AccountProjection {
   public String getId();
   public AccountType getType();
   public Double getBalance();
}
