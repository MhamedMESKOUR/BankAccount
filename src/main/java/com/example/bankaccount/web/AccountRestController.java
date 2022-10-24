package com.example.bankaccount.web;

import com.example.bankaccount.dto.BankAccountRequestDTO;
import com.example.bankaccount.dto.BankAccountResponseDTO;
import com.example.bankaccount.entities.BankAccount;
import com.example.bankaccount.mappers.AccountMapper;
import com.example.bankaccount.repositories.BankAccountRepository;
import com.example.bankaccount.service.AccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AccountRestController {


    private BankAccountRepository bankAccountRepository;
    private AccountService accountService;
    private AccountMapper accountMapper;

    public AccountRestController(BankAccountRepository bankAccountRepository, AccountService accountService, AccountMapper accountMapper) {
        this.bankAccountRepository = bankAccountRepository;
        this.accountService = accountService;
        this.accountMapper = accountMapper;
    }

    @GetMapping("/bankAccounts")
    public List<BankAccount> bankAccounts(){
        return bankAccountRepository.findAll();
    }

    @GetMapping("/bankAccount/{id}")
    public BankAccount bankAccount(@PathVariable String id){
        return bankAccountRepository.findById(id)
                .orElseThrow(()->new RuntimeException(String.format("Account %s not found",id)));
    }

    @PostMapping("/bankAccounts")
    public BankAccountResponseDTO save(@RequestBody BankAccountRequestDTO requestDTO){

        return accountService.addAccount(requestDTO);
    }


    @PutMapping("/bankAccounts/{id}")
    public BankAccount update(@PathVariable String id,@RequestBody BankAccount bankAccount){

        BankAccount account=bankAccountRepository.findById(id).orElseThrow();
        if (bankAccount.getBalance()!= null)account.setBalance(bankAccount.getBalance());
        if (bankAccount.getCurrency()!= null)account.setCurrency(bankAccount.getCurrency());
        if (bankAccount.getCreateDat()!= null)account.setCreateDat(bankAccount.getCreateDat());
        if (bankAccount.getType()!= null)account.setType(bankAccount.getType());
        return bankAccountRepository.save(account);
    }
    @DeleteMapping("/bankAccount/{id}")
    public void deleteAccount(@PathVariable String id){
         bankAccountRepository.deleteById(id);
    }
}