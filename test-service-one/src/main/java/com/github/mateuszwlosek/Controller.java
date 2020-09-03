package com.github.mateuszwlosek;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class Controller {

	@GetMapping("/test")
	public String hello() {
		return "Hello World from test service one!";
	}
}
