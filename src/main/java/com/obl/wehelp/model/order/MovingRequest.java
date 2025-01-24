package com.obl.wehelp.model.order;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@NoArgsConstructor
public class MovingRequest extends OrderRequest{
    ClientProperty movingFrom;
    ClientProperty movingTo;
    boolean moveApplianceUpOrDown;
    int helpers;
}
