package com.example.demospring4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Democlass {
	@GetMapping("/First")
	public String print() {
		return "Welcome Ajimoon";
	}

}
