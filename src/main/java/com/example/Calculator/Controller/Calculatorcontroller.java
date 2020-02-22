package com.example.Calculator.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class Calculatorcontroller {
    @RequestMapping("calculator")
    public String index() {
        return "index.jsp";
    }
    }
