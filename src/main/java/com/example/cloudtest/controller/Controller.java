package com.example.cloudtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

	@GetMapping("/")
	public String greeting() {
		return "Wow! your application is deployed in Openshift Succesfully";
	}

	@GetMapping("/{name}")
	public String test(@PathVariable("name") String name) {
		return name;
	}

}