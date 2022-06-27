package com.nttdata.businness;

import com.nttdata.model.api.RequestClient;
import com.nttdata.model.api.ResponseClient;
import com.nttdata.model.entity.Client;
import reactor.core.publisher.Mono;

/**
 * Esta clase es la interfaz que permite respetar la separacion entre
 * la capa api y la logica de negocios
 */
public interface ClientService {
    Mono<ResponseClient> create(RequestClient request);
    Mono<ResponseClient> findAll(RequestClient request);
    Mono<ResponseClient> update(RequestClient request);
    Mono<ResponseClient> delete(RequestClient request);
}
