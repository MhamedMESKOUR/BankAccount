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
public class BankAccountResponseDTO {
    private String id;
    private Date createDat;
    private Double balance;
    private String currency;
    private AccountType type;
}
