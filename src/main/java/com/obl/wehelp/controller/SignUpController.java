package com.obl.wehelp.controller;

import com.obl.wehelp.model.EmployeeApplicant;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignUpController {

    @GetMapping("/joinus")
    public ResponseEntity apply(@RequestBody EmployeeApplicant request) {
        return null;
    }
}
