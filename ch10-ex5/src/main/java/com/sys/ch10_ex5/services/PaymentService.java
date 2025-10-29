package com.sys.ch10_ex5.services;

import org.springframework.stereotype.Service;

import com.sys.ch10_ex5.exceptions.NotEnoughMoneyException;
import com.sys.ch10_ex5.models.PaymentDetails;

@Service
public class PaymentService {

	public PaymentDetails processPayment() {
		throw new NotEnoughMoneyException();
	}
}
