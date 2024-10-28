package com.obl.wehelp.model;

public enum EmployeeType {
    DRIVER("driver"),
    MOVING_HELPER("moving_helper"),
    MOVING_DRIVER("moving_driver"),
    HOUSE_CLEANER("house_cleaner"),
    DEEP_CLEANER("deep_cleaner"),
    TECHNICIAN("technician");

    // Field for custom ordinal name
    private final String customOrdinal;

    // Constructor to set custom ordinal name
    EmployeeType(String customOrdinal) {
        this.customOrdinal = customOrdinal;
    }

    // Getter for the custom ordinal name
    public String getCustomOrdinal() {
        return customOrdinal;
    }

    // Getter for the name of the enum (built-in method `name()` also does this)
    public String getName() {
        return name();
    }

    // Getter for the type (returns the enum instance itself)
    public EmployeeType getType() {
        return this;
    }

    // Static method to get an EmployeeType by its name (case-insensitive)
    public static EmployeeType getByName(String name) {
        for (EmployeeType type : EmployeeType.values()) {
            if (type.name().equalsIgnoreCase(name)) {
                return type;
            }
        }
        throw new IllegalArgumentException("No enum constant with name: " + name);
    }

    // Static method to get an EmployeeType by custom ordinal
    public static EmployeeType getByCustomOrdinal(String customOrdinal) {
        for (EmployeeType type : EmployeeType.values()) {
            if (type.getCustomOrdinal().equalsIgnoreCase(customOrdinal)) {
                return type;
            }
        }
        throw new IllegalArgumentException("No enum constant with custom ordinal: " + customOrdinal);
    }
}
