package com.example.bankaccount.dto;

import com.example.bankaccount.enums.AccountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Date;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class BankAccountRequestDTO {


    private Double balance;
    private String currency;
    private AccountType type;
}
