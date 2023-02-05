package com.ivandjoh.springjwt.service;

import com.ivandjoh.springjwt.dtos.HomeDTO;
import org.springframework.http.ResponseEntity;

import java.security.Principal;

public interface HomeService {
    ResponseEntity<HomeDTO> getHome(Principal principal);
}
