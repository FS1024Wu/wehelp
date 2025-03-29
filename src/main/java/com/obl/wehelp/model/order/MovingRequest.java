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
public class MovingRequest extends OrderRequest{
    boolean loading;
    PropertyType movingFromPropertyType;
    boolean unloading;
    boolean loadAndUnload;
    int helpers;
    RequestVehicleType requestVehicleType;
    boolean moveApplianceUpOrDown;//washer, dryer, oven, fridge
    boolean hasSpecialItems;


    @JsonIgnore
    @Override
    public Class<? extends Request> getRequestClass() {
        return MovingRequest.class;
    }
}
