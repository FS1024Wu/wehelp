package com.obl.wehelp.model;

public interface Request {
    Class<? extends Request> getRequestClass();
    // Getters and Setters
}
