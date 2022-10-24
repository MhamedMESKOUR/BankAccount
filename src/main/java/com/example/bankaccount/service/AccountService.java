package com.example.bankaccount.service;

import com.example.bankaccount.dto.BankAccountRequestDTO;
import com.example.bankaccount.dto.BankAccountResponseDTO;

public interface AccountService {
    BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);
}
