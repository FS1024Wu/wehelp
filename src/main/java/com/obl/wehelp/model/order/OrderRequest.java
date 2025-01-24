package com.obl.wehelp.model.order;

import com.obl.wehelp.model.Request;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@ToString
@Getter
@Setter
@NoArgsConstructor
public class OrderRequest implements Request {
    Address fromAddress; //moving, driving
    Address toAddress;   //moving, driving, clean, tech
    LocalDateTime fromTime;  //moving, clean, tech, driving
    LocalDateTime toTime;    //moving, clean, tech
}
