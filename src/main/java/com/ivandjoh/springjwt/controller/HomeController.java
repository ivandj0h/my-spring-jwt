package com.ivandjoh.springjwt.controller;

import com.ivandjoh.springjwt.dtos.GeneralResponseDTO;
import com.ivandjoh.springjwt.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api/v1")
public class HomeController {

    private static final Logger LOGGER = Logger.getLogger(HomeController.class.getName());


    @Autowired
    private HomeService homeService;

    @GetMapping("/home")
    public ResponseEntity<?> home(Principal principal) {

        LOGGER.info("Hello " + principal.getName());

        return homeService.getHome(principal);
    }
}
