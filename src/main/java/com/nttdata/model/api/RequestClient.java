package com.nttdata.model.api;

import lombok.*;

import java.util.Date;

//@Data
@ToString
@Getter
@Setter
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
/**
 * Esta clase implementa un requerimiento de cliente de la api
 */
public class RequestClient {
    private String id;
    private String document;
    private String phone;
    private String imei;

    private Boolean fgActive;
    private Date fecCreation;
}
