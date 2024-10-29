package com.obl.wehelp.model.order;

public class Address {
    private String streetAddress;  // Example: "123 Main St"
    private String apartmentOrSuiteOrUnit;  // Example: "Apt 4B" or "Suite 200"
    private String city;  // Example: "New York"
    private String state;  // Example: "NY"
    private String zipCode;  // Example: "10001"
    private String zipCodeExtension;  // Optional: "1234" for ZIP+4
    private String country = "USA";  // Default value is "USA"
}
