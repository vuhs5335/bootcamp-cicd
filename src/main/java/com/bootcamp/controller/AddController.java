package com.bootcamp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController {

	@GetMapping("/add-ten")
	  AddResponse all() {
	    return new AddResponse(18);
	  }
}
