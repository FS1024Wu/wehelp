package com.obl.wehelp.model.order;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@NoArgsConstructor
public class TaxiRequest extends OrderRequest{
    VehicleType requestedVehicleType;
}
