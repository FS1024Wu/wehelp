package com.obl.wehelp.model.order;

public enum OrderType {
    MOVING("moving"),
    PROPERTY_CLEANING("property_cleaning"),
    DEEP_CLEANING("deep_cleaning"),
    TECHNICIAN("technician"),
    DRIVING("driving");

    // Field to hold the custom ordinal string
    private final String customOrdinal;

    // Constructor to initialize the custom ordinal string
    OrderType(String customOrdinal) {
        this.customOrdinal = customOrdinal;
    }

    // Getter for the custom ordinal string
    public String getCustomOrdinal() {
        return customOrdinal;
    }

    // Getter for the enum's name (inherited `name()` method)
    public String getName() {
        return name();
    }

    // Getter for the enum constant (returns itself)
    public OrderType getType() {
        return this;
    }

    // Static method to get an OrderType by its name (case-insensitive)
    public static OrderType getByName(String name) {
        for (OrderType type : OrderType.values()) {
            if (type.name().equalsIgnoreCase(name)) {
                return type;
            }
        }
        throw new IllegalArgumentException("No enum constant with name: " + name);
    }

    // Static method to get an OrderType by custom ordinal
    public static OrderType getByCustomOrdinal(String customOrdinal) {
        for (OrderType type : OrderType.values()) {
            if (type.getCustomOrdinal().equalsIgnoreCase(customOrdinal)) {
                return type;
            }
        }
        throw new IllegalArgumentException("No enum constant with custom ordinal: " + customOrdinal);
    }
}

