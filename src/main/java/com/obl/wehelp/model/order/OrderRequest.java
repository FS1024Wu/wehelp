package com.obl.wehelp.model.order;

import com.obl.wehelp.model.Request;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@ToString
@Getter
@Setter
@NoArgsConstructor
public abstract class OrderRequest implements Request {
    Address fromAddress; //moving, driving
    Address toAddress;   //moving, driving, clean, tech
    String localFromTime;  //moving, clean, tech, driving
    String localToTime;    //moving, clean, tech
}
