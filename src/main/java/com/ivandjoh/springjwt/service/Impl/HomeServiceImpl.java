package com.ivandjoh.springjwt.service.Impl;

import com.ivandjoh.springjwt.dtos.HomeDTO;
import com.ivandjoh.springjwt.service.HomeService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.security.Principal;

@Service
public class HomeServiceImpl implements HomeService {
    @Override
    public ResponseEntity<HomeDTO> getHome(Principal principal) {

        return principal != null
                ? ResponseEntity.ok(new HomeDTO("Hello " + principal.getName()))
                : ResponseEntity.ok(new HomeDTO("Hello World"));
    }
}
