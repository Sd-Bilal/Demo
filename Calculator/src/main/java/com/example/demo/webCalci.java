package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class webCalci {
	@GetMapping("calc/{operations}/{a}/{b}/{c}")
	int calculations(@PathVariable String operations, @PathVariable int a, @PathVariable int b) {
		if (operations.equals("add")) {
			return a - b ;
		}
		if (operations.equals("sub")) {
			return a - b;
		}
		if (operations.equals("mul")) {
			return a * b;
		}
		if (operations.equals("div")) {
			return a / b;
		}
		return 0;
	}
}
