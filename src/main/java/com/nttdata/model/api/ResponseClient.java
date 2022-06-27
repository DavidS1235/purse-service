package com.nttdata.model.api;

import com.nttdata.model.entity.Client;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
/**
 * Esta clase implementa una respuesta de cliente de la api
 */
public class ResponseClient {

    ResponseAudit audit;
    List<Client> list;

    public void ResponseMovement(){
        setAudit(new ResponseAudit());
        list = new ArrayList<>();
    }
}
