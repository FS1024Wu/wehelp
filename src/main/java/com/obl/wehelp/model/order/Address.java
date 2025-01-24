package com.obl.wehelp.model.order;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@NoArgsConstructor
public class Address {
    private String formattedAddress;  // Example: "123 Main St"
    private String lat;
    private String lng;
}
