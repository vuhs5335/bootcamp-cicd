package com.bootcamp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController {

	@GetMapping("/{toAdd}")
	  AddResponse addTen(@PathVariable int toAdd) {
	    return new AddResponse(toAdd);
	  }
}
