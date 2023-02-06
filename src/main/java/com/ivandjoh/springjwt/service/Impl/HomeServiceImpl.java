package com.ivandjoh.springjwt.service.Impl;

import com.ivandjoh.springjwt.dtos.GeneralResponseDTO;
import com.ivandjoh.springjwt.dtos.HomeDTO;
import com.ivandjoh.springjwt.service.HomeService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.security.Principal;

@Service
public class HomeServiceImpl implements HomeService {
    @Override
    public ResponseEntity<GeneralResponseDTO> getHome(Principal principal) {

        GeneralResponseDTO data = new GeneralResponseDTO();
                data.setCode(200);
                data.setStatusCode("OK");

        HomeDTO home = new HomeDTO();
        home.setName(principal.getName());
        home.setWelcomeMessage("Hello " + principal.getName() + "!");

        return ResponseEntity.ok(data);
    }
}
