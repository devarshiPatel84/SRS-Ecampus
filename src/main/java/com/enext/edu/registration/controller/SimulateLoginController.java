package com.enext.edu.registration.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import jakarta.servlet.http.HttpSession;

@Controller
public class SimulateLoginController {

    @GetMapping("/login")
    public String login(HttpSession session) {
        session.setAttribute("studentId", 6509L);
        return "redirect:/studentRegistrations"; 
    }
}