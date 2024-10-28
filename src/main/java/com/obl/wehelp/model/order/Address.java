package com.obl.wehelp.model.order;

public class USAAddress {
    private String streetAddress;  // Example: "123 Main St"
    private String apartmentOrSuiteOrUnit;  // Example: "Apt 4B" or "Suite 200"
    private String city;  // Example: "New York"
    private String state;  // Example: "NY"
    private String zipCode;  // Example: "10001"
    private String zipCodeExtension;  // Optional: "1234" for ZIP+4
    private String country = "USA";  // Default value is "USA"

    // Constructor
    public USAAddress(String streetAddress, String apartmentOrSuite, String city, 
                      String state, String zipCode, String zipCodeExtension) {
        this.streetAddress = streetAddress;
        this.apartmentOrSuiteOrUnit = apartmentOrSuite;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.zipCodeExtension = zipCodeExtension;
    }

    // Getters
    public String getStreetAddress() {
        return streetAddress;
    }

    public String getApartmentOrSuiteOrUnit() {
        return apartmentOrSuiteOrUnit;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getZipCodeExtension() {
        return zipCodeExtension;
    }

    public String getCountry() {
        return country;
    }

    // Setters (optional, if the address can change)
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setApartmentOrSuite(String apartmentOrSuite) {
        this.apartmentOrSuite = apartmentOrSuite;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setZipCodeExtension(String zipCodeExtension) {
        this.zipCodeExtension = zipCodeExtension;
    }

    // toString() for easy printing
    @Override
    public String toString() {
        return streetAddress + 
               (apartmentOrSuite != null && !apartmentOrSuite.isEmpty() ? ", " + apartmentOrSuite : "") +
               ", " + city + ", " + state + " " + zipCode +
               (zipCodeExtension != null && !zipCodeExtension.isEmpty() ? "-" + zipCodeExtension : "") +
               ", " + country;
    }
}
