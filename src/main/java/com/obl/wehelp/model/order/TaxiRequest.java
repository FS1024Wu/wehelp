package com.obl.wehelp.model.order;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.obl.wehelp.model.Request;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@NoArgsConstructor
public class TaxiRequest extends OrderRequest{
    RequestVehicleType requestedVehicleType;

    @JsonIgnore
    @Override
    public Class<? extends Request> getRequestClass() {
        return TaxiRequest.class;
    }
}
