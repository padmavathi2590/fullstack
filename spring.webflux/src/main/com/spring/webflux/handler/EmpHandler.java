package com.spring.webflux.handler;

import com.spring.webflux.model.Employee;
import com.spring.webflux.service.EmpService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class EmpHandler {
    private final EmpService empService;

    public Mono<ServerResponse> getAllEmployee(ServerRequest request){
        return ServerResponse
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(empService.getAllEmployee(), Employee.class);
    }

}
