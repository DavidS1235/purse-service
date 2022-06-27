package com.nttdata.model.api;

import lombok.*;

import java.util.Date;


//@Data
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
/**
 * Esta clase implementa un registro de auditoria de la api
 */
public class ResponseAudit {

    String code;
    String message;
    Date date;

    public void ResponseAudit(){
        date = new Date();
    }
}
