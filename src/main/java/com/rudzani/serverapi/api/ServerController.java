package com.rudzani.serverapi.api;

import com.rudzani.serverapi.model.Server;
import com.rudzani.serverapi.service.ServerServiceImplementation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static java.util.Map.of;

import static java.time.LocalDateTime.now;
import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("api/servers")
public class ServerController {

    private ServerServiceImplementation service;

    public ServerController(ServerServiceImplementation service) {
        this.service = service;
    }
    @PostMapping("/save")
    public ResponseEntity<Response> saveServer(@RequestBody Server server){
        return ResponseEntity.ok(
                Response.builder()
                        .timestamp(now())
                        .data(of("Server",service.create(server)))
                        .message("server created sucsessfully")
                        .status(CREATED)
                        .statusCode(CREATED.value())
                        .build()
        );
    }
}
