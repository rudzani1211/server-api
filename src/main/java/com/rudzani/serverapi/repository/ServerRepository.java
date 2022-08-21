package com.rudzani.serverapi.repository;

import com.rudzani.serverapi.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServerRepository extends JpaRepository<Server,Long> {

    Server findByIpAddress(String ipAddress);
}
