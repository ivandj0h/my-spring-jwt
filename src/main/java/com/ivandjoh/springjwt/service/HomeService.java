package com.ivandjoh.springjwt.service;

import com.ivandjoh.springjwt.dtos.GeneralResponseDTO;
import org.springframework.http.ResponseEntity;

import java.security.Principal;

public interface HomeService {
    ResponseEntity<GeneralResponseDTO> getHome(Principal principal);
}
