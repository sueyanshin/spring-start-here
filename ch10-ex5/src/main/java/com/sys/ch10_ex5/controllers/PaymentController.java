package com.sys.ch10_ex5.controllers;

import java.util.logging.Logger;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sys.ch10_ex5.Ch10Ex5Application;
import com.sys.ch10_ex5.models.PaymentDetails;
import com.sys.ch10_ex5.services.PaymentService;

@RestController
public class PaymentController {

	private final PaymentService paymentService;

	private static Logger logger = Logger.getLogger(PaymentController.class.getName());

	public PaymentController(PaymentService paymentService, Ch10Ex5Application ch10Ex5Application) {
		this.paymentService = paymentService;
	}

//	@GetMapping("/payment")
//	public ResponseEntity<?> makePayment() {
//		try {
//			PaymentDetails paymentDetails = paymentService.processPayment();
//			return ResponseEntity.status(HttpStatus.ACCEPTED).body(paymentDetails);
//		} catch (NotEnoughMoneyException e) {
//			ErrorDetails errorDetails = new ErrorDetails();
//			errorDetails.setMessage("Not enough money to make payment");
//			return ResponseEntity.status(HttpStatus.BAD_REQUEST)
//
//					.body(errorDetails);
//		}
//	}

//	@GetMapping("/payment")
//	public ResponseEntity<PaymentDetails> makePayment() {
//		PaymentDetails paymentDetails = paymentService.processPayment();
//
//		return ResponseEntity.status(HttpStatus.ACCEPTED).body(paymentDetails);
//	}

	@GetMapping("/payment")
	public ResponseEntity<PaymentDetails> makePayment(@RequestBody PaymentDetails paymentDetails) {
		logger.info("Received payment " + paymentDetails.getAmount());

		return ResponseEntity.status(HttpStatus.ACCEPTED).body(paymentDetails);
	}

}
