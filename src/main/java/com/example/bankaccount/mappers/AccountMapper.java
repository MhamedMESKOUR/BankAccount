package com.example.bankaccount.mappers;


import com.example.bankaccount.dto.BankAccountResponseDTO;
import com.example.bankaccount.entities.BankAccount;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {
    public BankAccountResponseDTO fromBankAccount(BankAccount bankAccount){
      BankAccountResponseDTO bankAccountResponseDTO=new BankAccountResponseDTO();

        BeanUtils.copyProperties(bankAccount,bankAccountResponseDTO);
        return bankAccountResponseDTO;
    }
}
