package com.obl.wehelp.controller;

import com.obl.wehelp.model.Request;
import com.obl.wehelp.model.signup.EmployeeApplicantRequest;
import com.obl.wehelp.model.signup.PartnerApplicantRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignUpController {

    @PostMapping("/signup/user")
    public ResponseEntity apply(@RequestBody Request request) {
        return null;
    }

    @PostMapping("/signup/employee")
    public ResponseEntity apply(@RequestBody EmployeeApplicantRequest request) {
        return null;
    }

    @PostMapping("/signup/partner")
    public ResponseEntity apply(@RequestBody PartnerApplicantRequest request) {
        return null;
    }
}
