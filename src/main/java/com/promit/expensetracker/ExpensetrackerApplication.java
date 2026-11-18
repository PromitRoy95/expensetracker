package com.promit.expensetracker;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class ExpensetrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpensetrackerApplication.class, args);
	}

	@GetMapping("/")
    public String hello(@RequestParam(defaultValue = "World") String name) {
      return String.format("Hello %s!", name);
    }

	@GetMapping("/greeting")
    public String greeting(Model model) {
        model.addAttribute("username", "Alex");
        model.addAttribute("items", List.of("Java", "Spring Boot", "Thymeleaf"));
        return "greeting"; // Resolves to templates/greeting.html
    }
}
