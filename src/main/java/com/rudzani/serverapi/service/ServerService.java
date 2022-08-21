package com.rudzani.serverapi.service;

import com.rudzani.serverapi.model.Server;

import java.util.Collection;

public interface ServerService {
    //CRUD Create Read Update Delete
    Server create(Server server);
    Server ping(String ipAddress);
    Collection<Server> list(int limit);
    Server get(Long id);
    Server update(Server server);
    Server delete(Long id);
}
