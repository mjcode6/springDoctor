package com.wildcodeschool.myproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DoctorController {

    @GetMapping("/doctor/1")
    public String doctor1() {
        return "William Hartnell";
    }

    @GetMapping("/doctor/10")
    public String doctor10() {
        return "David Tennant";
    }

    @GetMapping("/doctor/13")
    public String doctor13() {
        return "Jodie Whittaker";
    }
}
