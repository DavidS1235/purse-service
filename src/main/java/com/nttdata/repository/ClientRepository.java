package com.nttdata.repository;

import com.nttdata.model.api.RequestClient;
import com.nttdata.model.entity.Client;

import java.util.List;

public interface ClientRepository {
    Client create(RequestClient request);
    List<Client> findAll(RequestClient request);
    Client delete(RequestClient request);
}
