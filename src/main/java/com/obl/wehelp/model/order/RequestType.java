package com.obl.wehelp.model.order;

import com.obl.wehelp.model.Request;

public enum RequestType {
    MOVING("moving", MovingRequest.class),
    HOUSE_CLEANING("house_cleaning", HouseCleanRequest.class),
    DEEP_CLEANING("deep_cleaning", DeepCleanRequest.class),
    TECHNICIAN("technician", null),
    TAXI("taxi", TaxiRequest.class);

    RequestType(String moving, Class<? extends Request> request) {
    }
}

