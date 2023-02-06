package com.ivandjoh.springjwt.service.Impl;

import com.ivandjoh.springjwt.dtos.GeneralResponseDTO;
import com.ivandjoh.springjwt.dtos.HomeDTO;
import com.ivandjoh.springjwt.service.HomeService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

@Service
public class HomeServiceImpl implements HomeService {
    @Override
    public ResponseEntity<?> getHome(Principal principal) {

        GeneralResponseDTO data = new GeneralResponseDTO();
                data.setCode(200);
                data.setCodeStatus("OK");

        HomeDTO home = new HomeDTO();
        home.setName(principal.getName());
        home.setWelcomeMessage("Hello " + principal.getName() + "!");

        ArrayList<HomeDTO> homeList = new ArrayList<>();
        homeList.add(home);

        HashMap<String, Object> response = new HashMap<>();
        response.put("code", data.getCode());
        response.put("code_status", data.getCodeStatus());
        response.put("data", homeList);

        TreeMap<String, Object> sorted = new TreeMap<>();
        sorted.put("code", response.get("code"));
        sorted.put("code_status", response.get("code_status"));
        sorted.put("data", response.get("data"));

        return ResponseEntity.ok(sorted);
    }
}
