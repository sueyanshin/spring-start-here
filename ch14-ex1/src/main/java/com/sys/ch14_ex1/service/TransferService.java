package com.sys.ch14_ex1.service;

import com.sys.ch14_ex1.exception.AccountNotFoundException;
import com.sys.ch14_ex1.model.Account;
import com.sys.ch14_ex1.repository.AccountRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
public class TransferService {
    private  final AccountRepository accountRepository;

    public TransferService(AccountRepository accountRepository){
        this.accountRepository= accountRepository;
    }

    public Iterable<Account> getAllAccounts(){
        return accountRepository.findAll();
    }

    public List<Account> findAccountByName(String name){
        return accountRepository.findAccountsByName(name);
    }

    @Transactional
    public void transferMoney(
            long idSender,
            long idReceiver,
            BigDecimal amount
            ){
        Account sender = accountRepository.findById(idSender)
                .orElseThrow(AccountNotFoundException::new);

        Account receiver = accountRepository.findById(idReceiver)
                .orElseThrow(AccountNotFoundException::new);

        BigDecimal senderNewAmount = sender.getAmount().subtract(amount);

        BigDecimal receiverNewAmount = receiver.getAmount().add(amount);

        accountRepository.changeAmount(idSender,senderNewAmount);
        accountRepository.changeAmount(idReceiver,receiverNewAmount);
    }
}
