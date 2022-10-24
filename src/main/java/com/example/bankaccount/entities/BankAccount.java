package com.example.bankaccount.entities;

import com.example.bankaccount.enums.AccountType;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import java.util.Date;

@Entity @Data @AllArgsConstructor @NoArgsConstructor @ToString @Builder
public class BankAccount {

    @Id
    private String id;
    private Date createDat;
    private Double balance;
    private String currency;
    @Enumerated(EnumType.STRING)
    private AccountType type;
}
