package com.siooka.demo.controller;

import com.siooka.demo.data.data_transfert_object.SiretDetailsDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/siret")
public class SiretController {

    @GetMapping("/details")
    public String getSiretDetails() {
        return "";
    }
}
