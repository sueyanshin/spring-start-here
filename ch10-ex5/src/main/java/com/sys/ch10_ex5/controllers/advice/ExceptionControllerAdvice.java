package com.sys.ch10_ex5.controllers.advice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.sys.ch10_ex5.exceptions.NotEnoughMoneyException;
import com.sys.ch10_ex5.models.ErrorDetails;

@RestControllerAdvice
public class ExceptionControllerAdvice {

	@ExceptionHandler(NotEnoughMoneyException.class)
	public ResponseEntity<ErrorDetails> exceptionNotEnoughMoneyHandler() {
		ErrorDetails errorDetails = new ErrorDetails();

		errorDetails.setMessage("Not enough money to make payment.");

		return ResponseEntity.badRequest().body(errorDetails);

	}
}
