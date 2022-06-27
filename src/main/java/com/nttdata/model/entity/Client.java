package com.nttdata.model.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

//@Data
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "CLIENT")
/**
 * Esta clase implementa un requerimiento de cliente de la api
 */
public class Client {
    @Id
    private String id;
    private String document;
    private String phone;
    private String imei;

    private Boolean fgActive;
}
