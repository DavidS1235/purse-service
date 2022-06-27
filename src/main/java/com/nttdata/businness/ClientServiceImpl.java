package com.nttdata.businness;

import com.nttdata.model.api.RequestClient;
import com.nttdata.model.api.ResponseAudit;
import com.nttdata.model.api.ResponseClient;
import com.nttdata.model.entity.Client;
import com.nttdata.repository.ClientRepository;
import com.nttdata.utils.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.Date;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    /**
     * Este método se encarga de solicitar la creacion de un registro
     * @param request objeto recibido de la api
     * @return Mono<ResponseMovement> objeto devuelto por la base de datos
     */
    public Mono<ResponseClient> create(RequestClient request) {
        ResponseClient response = new ResponseClient();
        Client client;

        response.setAudit(new ResponseAudit());
        response.getAudit().setDate(new Date());

        try{
            client = clientRepository.create(request);

            if(null != client){
                if(!client.getId().isEmpty()){
                    response.getAudit().setCode(Constant.CODE_OK);
                    response.setList(new ArrayList<>());
                    response.getList().add(client);
                }
                else{
                    response.getAudit().setCode(Constant.CODE_ERROR);
                }
            } else {
                response.getAudit().setCode(Constant.CODE_UNKNOWN);
            }
        } catch(Exception e){
            response.getAudit().setCode(Constant.CODE_EXCEPTION);
            response.getAudit().setMessage(e.getMessage());
        }

        return Mono.just(response);
    }

    @Override
    /**
     * Este método se encarga de solicitar la busqueda de registros
     * @param request objeto recibido de la api con los filtros de busqueda
     * @return Mono<ResponseClient> lista de registros obtenidos
     */
    public Mono<ResponseClient> findAll(RequestClient request) {
        return null;
    }

    @Override
    /**
     * Este método se encarga de solicitar la actualizacion de un registro
     * @param request objeto recibido de la api
     * @return Mono<ResponseMovement> objeto devuelto por la base de datos
     */
    public Mono<ResponseClient> update(RequestClient request) {
        return null;
    }

    @Override
    /**
     * Este método se encarga de solicitar el borrado logico de un registro
     * @param request objeto recibido de la api
     * @return Mono<ResponseMovement> objeto devuelto por la base de datos
     */
    public Mono<ResponseClient> delete(RequestClient request) {
        return null;
    }
}
