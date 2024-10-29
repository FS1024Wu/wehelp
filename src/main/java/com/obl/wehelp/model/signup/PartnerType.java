package com.obl.wehelp.model.signup;

public enum PartnerType {
    MOVING("moving"),
    PROPERTY_CLEANER("property_cleaner"),
    DEEP_CLEANER("deep_cleaner"),
    TECHNICIAN("technician"),;

    // Field for custom ordinal name
    private final String customOrdinal;

    // Constructor to set custom ordinal name
    PartnerType(String customOrdinal) {
        this.customOrdinal = customOrdinal;
    }

    // Getter for the custom ordinal name
    public String getCustomOrdinal() {
        return customOrdinal;
    }

    // Getter for the name of the enum constant (name is built-in)
    public String getName() {
        return name();
    }

    // Getter for the enum type (returns the enum instance itself)
    public PartnerType getType() {
        return this;
    }

    // Static method to get a PartnerType by its name (case-insensitive)
    public static PartnerType getByName(String name) {
        for (PartnerType type : PartnerType.values()) {
            if (type.name().equalsIgnoreCase(name)) {
                return type;
            }
        }
        throw new IllegalArgumentException("No enum constant with name: " + name);
    }

    // Static method to get a PartnerType by custom ordinal
    public static PartnerType getByCustomOrdinal(String customOrdinal) {
        for (PartnerType type : PartnerType.values()) {
            if (type.getCustomOrdinal().equalsIgnoreCase(customOrdinal)) {
                return type;
            }
        }
        throw new IllegalArgumentException("No enum constant with custom ordinal: " + customOrdinal);
    }
}
