package com.ivandjoh.springjwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api/v1")
public class HomeController {

    private static final Logger LOGGER = Logger.getLogger(HomeController.class.getName());

    @GetMapping("")
    public String home(Principal principal) {

        LOGGER.info("Hello " + principal.getName());

        return "Hello " + principal.getName();
    }
}
