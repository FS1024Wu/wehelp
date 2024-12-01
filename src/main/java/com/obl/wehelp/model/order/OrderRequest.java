package com.obl.wehelp.model.order;

import com.obl.wehelp.model.Request;

import java.sql.Timestamp;


public class OrderRequest implements Request {
    Address fromAddress; //moving, driving
    Address toAddress;   //clean, tech
    Timestamp fromTime;  //moving, clean, tech, driving
    Timestamp toTime;    //moving, clean, tech
}