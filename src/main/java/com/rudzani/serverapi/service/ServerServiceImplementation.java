package com.rudzani.serverapi.service;

import com.rudzani.serverapi.model.Server;
import com.rudzani.serverapi.repository.ServerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.Collection;
import java.util.Random;

@Service
@Slf4j
public class ServerServiceImplementation implements ServerService{
    private ServerRepository repository;

    public ServerServiceImplementation(ServerRepository repository) {
        this.repository = repository;
    }

    @Override
    public Server create(Server server) {
        log.info("Saving Server{} :", server.getName());
        server.setImageUrl(setServerImageUrl());
        return repository.save(server);
    }

    private String setServerImageUrl() {
        String[] imageNames = {"server1.png","server2.png","server3.png","server4.png"};
        return ServletUriComponentsBuilder
                .fromCurrentContextPath()
                .path("/servers/image" + imageNames[new Random().nextInt(4)])
                .toUriString();
    }

    @Override
    public Server ping(String ipAddress) {

        return null;
    }

    @Override
    public Collection<Server> list(int limit) {
        return null;
    }

    @Override
    public Server get(Long id) {
        return null;
    }

    @Override
    public Server update(Server server) {
        return null;
    }

    @Override
    public Server delete(Long id) {
        return null;
    }
}
