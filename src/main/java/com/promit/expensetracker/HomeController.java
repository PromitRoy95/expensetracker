package com.promit.expensetracker;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class HomeController {
    @GetMapping({"/","/home"})
    public String homePage(Model model) {
        // Optional: Pass dynamic data to the HTML page
        model.addAttribute("pageTitle", "Welcome to Spring Boot");
        
        // Returns src/main/resources/templates/home.html
        return "home"; 
    }

    @GetMapping("/expenses")
    public String greeting(Model model) {
        model.addAttribute("username", "Alex");
        model.addAttribute("items", List.of("Java", "Spring Boot", "Thymeleaf"));
        return "expenses"; // Resolves to templates/greeting.html
    }
}
