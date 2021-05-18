package com.bootcamp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController {

	@GetMapping("/{toAdd}")
	AddResponse addTen(@PathVariable String toAdd) throws Exception {

		int a = 0;
		String message = "OK";

		try {
			a = Integer.valueOf(toAdd);
		} catch (Exception e) {
			a = -10;
			message = toAdd + " is an invalid argument.";
		}

		return new AddResponse(a, message);
	}
}
