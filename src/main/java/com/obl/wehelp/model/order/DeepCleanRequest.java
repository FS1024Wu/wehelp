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
public class DeepCleanRequest extends OrderRequest{
    boolean carpetWash;
    boolean hardwoodClean;
    boolean dryerDedusting;
    boolean pressureWash;

    @JsonIgnore
    @Override
    public Class<? extends Request> getRequestClass() {
        return DeepCleanRequest.class;
    }
}
