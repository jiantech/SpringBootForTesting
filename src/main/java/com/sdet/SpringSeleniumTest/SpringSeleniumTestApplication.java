package com.sdet.SpringSeleniumTest;

import com.sdet.SpringSeleniumTest.controller.TestExecutionController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringSeleniumTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSeleniumTestApplication.class, args);
	}

	@Autowired
	TestExecutionController testExecutionController;

	@GetMapping("/hello")
	public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}
}
