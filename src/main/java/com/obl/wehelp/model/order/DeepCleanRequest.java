package com.obl.wehelp.model.order;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@NoArgsConstructor
public class DeepCleanRequest extends OrderRequest{
    boolean carpetWash;
    boolean hardwoodClean;
    boolean dryerDusting;
    boolean acDusting;
    boolean pressureWash;
}
