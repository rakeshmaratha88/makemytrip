package com.example.makemytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class train {
    @GetMapping("/train")
    public String getData() {return "Please book your train at 20% discount from IRCTC"; }
}
