package com.sys.ch14_ex1.controller;

import com.sys.ch14_ex1.dto.TransferRequest;
import com.sys.ch14_ex1.model.Account;
import com.sys.ch14_ex1.service.TransferService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    private final TransferService transferService;

    public AccountController(TransferService transferService){
        this.transferService = transferService;
    }
    @PostMapping("/transfer")
    public void transferMoney(
            @RequestBody TransferRequest transferRequest
            ){
            transferService.transferMoney(
                    transferRequest.getSenderAccountId(),
                    transferRequest.getReceiverAccountId(),
                    transferRequest.getAmount()
            );
    }

    @GetMapping("/accounts")
    public Iterable<Account> getAllAccounts(
            @RequestBody(required = false) String name
    ){
        if(name == null){
            return transferService.getAllAccounts();
        }else{
            return transferService.findAccountByName(name);
        }
    }
}
