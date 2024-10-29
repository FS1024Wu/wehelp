package com.obl.wehelp.controller;

import com.obl.wehelp.model.order.DeepCleanRequest;
import com.obl.wehelp.model.order.MovingRequest;
import com.obl.wehelp.model.order.PropertyCleanRequest;
import com.obl.wehelp.model.order.TaxiRequest;
import com.obl.wehelp.model.signup.EmployeeApplicantRequest;
import com.obl.wehelp.model.signup.PartnerApplicantRequest;
import com.obl.wehelp.model.Request;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class OrderController {
    @PostMapping("/order/order")
    public ResponseEntity apply(@RequestBody Request request) {
        return null;
    }

    @PostMapping("/order/deepclean")
    public ResponseEntity apply(@RequestBody DeepCleanRequest request) {
        return null;
    }

    @PostMapping("/order/propertyclean")
    public ResponseEntity apply(@RequestBody PropertyCleanRequest request) {
        return null;
    }

    @PostMapping("/order/moving")
    public ResponseEntity apply(@RequestBody MovingRequest request) {
        return null;
    }

    @PostMapping("/order/taxi")
    public ResponseEntity apply(@RequestBody TaxiRequest request) {
        return null;
    }
}
//concurrency priority queue<request.timestamp>, checkout time limit, session out,  checkout sessions
//return obj: request uniqueId, pricing link, accept payments or deposit
//db: map req uniqueId to payment res uniqueId