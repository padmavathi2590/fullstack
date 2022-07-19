package com.spring.webflux.controller;

import com.spring.webflux.model.Employee;
import com.spring.webflux.service.EmpService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
@RestController
@RequestMapping("/registration")
public class EmpController {
    private final EmpService empService;

    @GetMapping
    public Flux<Employee> getAllEmployee(){
        return empService.getAllEmployee();
    }
}
