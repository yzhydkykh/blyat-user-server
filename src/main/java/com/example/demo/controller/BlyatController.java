package com.example.demo.controller;


import com.example.demo.Blyat;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/blyat")
public class BlyatController {

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("")
    public Blyat getBlyat(HttpServletResponse response) {
        response.addHeader("Content-Type", "application/json");
        Blyat blyat = new Blyat();
        blyat.setMessage("hello blyat");
        return blyat;
    }
}
