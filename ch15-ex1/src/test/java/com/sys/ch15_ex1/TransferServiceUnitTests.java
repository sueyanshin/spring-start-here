package com.sys.ch15_ex1;

import com.sys.ch15_ex1.exception.AccountNotFoundException;
import com.sys.ch15_ex1.model.Account;
import com.sys.ch15_ex1.repository.AccountRepository;
import com.sys.ch15_ex1.service.TransferService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class TransferServiceUnitTests {

    @Mock
    private AccountRepository accountRepository;

    @InjectMocks
    private TransferService transferService;

    @Test
    @DisplayName("Test the amount is transferred from one account to another if no exception occurs.")
    public void moneyTransferHappyFlow(){
        Account sender = new Account();
        sender.setId(1);
        sender.setAmount(new BigDecimal(10000));

        Account destination = new Account();
        destination.setId(2);
        destination.setAmount(new BigDecimal(10000));

        given(accountRepository.findById(sender.getId()))
                .willReturn(Optional.of(sender));

        given(accountRepository.findById(destination.getId()))
                .willReturn(Optional.of(destination));

        transferService.transferMoney(
                sender.getId(),
                destination.getId(),
                new BigDecimal(500)
        );

        verify(accountRepository)
                .changeAmount(1, new BigDecimal(9500));
        verify(accountRepository)
                .changeAmount(2, new BigDecimal(10500));
    }

    @Test
    public void moneyTransferDestinationAccountNotFoundFlow(){
        Account sender = new Account();
        sender.setId(1);
        sender.setAmount(new BigDecimal(1000));

        given(accountRepository.findById(1L))
                .willReturn(Optional.of(sender));
        given(accountRepository.findById(2L))
                .willReturn(Optional.empty());

        assertThrows(
                AccountNotFoundException.class,
                ()->transferService.transferMoney(
                        1,2, new BigDecimal(100))
        );

        verify(accountRepository,never())
                .changeAmount(anyLong(),any());
    }

}
