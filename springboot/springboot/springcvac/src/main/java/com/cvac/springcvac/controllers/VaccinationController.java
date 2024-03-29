package com.cvac.springcvac.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VaccinationController {

    @GetMapping("/")
    public String index() {
        return "index.html";
    }

    @GetMapping("/your-info")
    public String yourInfo() {
        return "your-info.html";
    }

    @GetMapping("/your-vaccinations")
    public String yourVaccinations() {
        return "your-vaccinations.html";
    }

    @GetMapping("/pending-vaccines")
    public String pendingVaccines() {
        return "pending-vaccines.html";
    }
}
