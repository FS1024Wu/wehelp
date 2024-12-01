package com.obl.wehelp.model.order;

public class MovingRequest extends OrderRequest{
    ClientProperty movingFrom;
    ClientProperty movingTo;
    boolean moveApplianceUpOrDown;
    boolean truckRentalByCustomer;
    boolean isTruckRentalByUs;
    int helpers;
}
