package com.sys.ch10_ex1.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sys.ch10_ex1.model.Country;

@RestController
public class CountryController {

//	@GetMapping("/france")
//	public Country france() {
//		Country c = Country.of("France", 47);
//		return c;
//	}

	@GetMapping("/all")
	public List<Country> countries() {
		Country c1 = Country.of("France", 67);
		Country c2 = Country.of("Japan", 22);

		return List.of(c1, c2);
	}

	@GetMapping("/france")
	public ResponseEntity<Country> france() {
		Country c = Country.of("France", 47);
		return ResponseEntity.status(HttpStatus.ACCEPTED).header("continent", "Europe").header("capital", "Paris")
				.header("favourite_food", "cheese and wine").body(c);
	}
}
