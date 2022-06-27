package com.nttdata.repository;

import com.nttdata.model.api.RequestClient;
import com.nttdata.model.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Esta clase se encarga de implementar la funcionalidad de la interfaz
 * para la comunicacion con la base de datos
 */
@Repository
public class ClientRepositoryImpl implements ClientRepository  {
    @Autowired
    private MongoTemplate template;

    @Override
    public Client create(RequestClient request) {
        return null;
    }

    @Override
    public List<Client> findAll(RequestClient request) {
        return null;
    }

    @Override
    public Client delete(RequestClient request) {
        return null;
    }
}
