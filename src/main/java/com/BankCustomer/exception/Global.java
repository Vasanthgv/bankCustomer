package com.BankCustomer.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class Global {
	@ExceptionHandler(NoNotFound.class)
	public ResponseEntity<Object> globelHandler() {
		return new ResponseEntity<>("give a proper input", HttpStatus.ACCEPTED);
	}
}
