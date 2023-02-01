package com.siooka.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/siret")
public class SiretController {
    public ResponseEntity<Object> getSiretDetails() {
        return new ResponseEntity<>();
    }
}
